package com.github.chenlingxiu.intellijplatformplugintemplatetemplate.services

import com.github.chenlingxiu.intellijplatformplugintemplatetemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
