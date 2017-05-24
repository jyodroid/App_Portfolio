package com.jyo.android.appportfolio.cucumber

import android.os.Bundle
import android.support.test.runner.AndroidJUnitRunner
import cucumber.api.android.CucumberInstrumentationCore

/**
 * Created by johntangarife on 5/24/17.
 */

class TestRunner : AndroidJUnitRunner() {

    private val mInstrumentationCore = CucumberInstrumentationCore(this)

    override fun onCreate(bundle: Bundle) {
        super.onCreate(bundle)
        // Read tags passed as parameters and overwrite @CucumberOptions tags inside CucumberTestCase.java
        mInstrumentationCore.create(bundle)
    }

    override fun onStart() {
        waitForIdleSync()
        mInstrumentationCore.start()
    }
}