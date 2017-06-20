package com.k_int.kipper;


class KipperPlugin implements Plugin<Project> {
    void apply(Project project) {

        project.extensions.create("kipper", KipperPluginExtension)

        project.task('hello') {
            doLast {
                println "${project.greeting.message} from ${project.greeting.greeter}"
            }
        }
    }
}

