package com.jyo.android.appportfolio.test

import cucumber.api.CucumberOptions

/**
 * Created by johntangarife on 5/24/17.
 */

@CucumberOptions(
        features = arrayOf("features"),
        monochrome = true,
        plugin = arrayOf("pretty",
                "html:/data/data/com.jyo.android.appportfolio/cucumber-reports",
                "json:/data/data/com.jyo.android.appportfolio/cucumber-reports/cucumber.json",
                "junit:/data/data/com.jyo.android.appportfolio/cucumber-reports/cucumber.xml"),
        glue = arrayOf("com.jyo.android.appportfolio.cucumber.steps")
)
class CucumberTests {}
