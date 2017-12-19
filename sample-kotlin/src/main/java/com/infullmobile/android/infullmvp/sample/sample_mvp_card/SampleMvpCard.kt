package com.infullmobile.android.infullmvp.sample.sample_mvp_card

import android.content.Context
import android.util.AttributeSet
import com.infullmobile.android.infullmvp.InFullMvpView
import com.infullmobile.android.infullmvp.sample.sample_mvp_card.di.SampleMvpCardGraph
import javax.inject.Inject

class SampleMvpCard(
        override val parentContext: Context,
        attrs: AttributeSet?
) : InFullMvpView<SampleMvpCardPresenter, SampleMvpCardView>(parentContext, attrs) {

    @Inject override lateinit var presenter: SampleMvpCardPresenter
    @Inject override lateinit var presentedView: SampleMvpCardView
    var sampleActivityGraph = SampleMvpCardGraph(parentContext)

    constructor(parentContext: Context) : this(parentContext, null)

    override fun injectIntoGraph() {
        sampleActivityGraph.inject(this)
    }
}