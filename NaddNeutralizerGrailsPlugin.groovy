class NaddNeutralizerGrailsPlugin {
    // the plugin version
    def version = "0.3"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.1 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def author = "Mike Wille"
    def authorEmail = "mike.wille@flowz.com"
    def title = "N.A.D.D Neutralizer"
    def description = '''\\
N.A.D.D Neutralizer decreases developer "latency" during grails builds.

See: http://phatness.com/2010/02/decrease-latency-on-grails-builds/

This plugin helps spread the love.

(What is N.A.D.D?
	See: http://randsinrepose.com/archives/2003/07/10/nadd.html)

Source is at: http://github.com/digerata/grails-nadd-neutralizer

Contributions are welcome.  Currently, this plugin only supports
Mac OS X and Linux with Festival TTS.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/nadd-neutralizer"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
