package com.github.angelbermudez57.abplugin.services

import com.github.angelbermudez57.abplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
