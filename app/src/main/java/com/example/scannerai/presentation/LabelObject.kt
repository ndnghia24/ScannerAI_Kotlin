package com.example.scannerai.presentation

import com.example.scannerai.domain.hit_test.OrientatedPosition
import com.google.ar.core.Anchor
import io.github.sceneview.ar.node.ArNode

data class LabelObject(
    val label: String,
    val pos: OrientatedPosition,
    var node: ArNode? = null,
    var anchor: Anchor? = null
)
