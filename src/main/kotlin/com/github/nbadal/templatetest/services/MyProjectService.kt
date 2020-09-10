package com.github.nbadal.templatetest.services

import com.intellij.openapi.project.Project
import com.github.nbadal.templatetest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
