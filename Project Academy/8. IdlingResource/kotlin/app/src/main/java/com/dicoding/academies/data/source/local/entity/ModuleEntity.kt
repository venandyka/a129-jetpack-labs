package com.dicoding.academies.data.source.local.entity

data class ModuleEntity(
        var moduleId: String?,
        var courseId: String?,
        var title: String?,
        var position: Int?,
        var read: Boolean? = false
){
    lateinit var contentEntity: ContentEntity
}
