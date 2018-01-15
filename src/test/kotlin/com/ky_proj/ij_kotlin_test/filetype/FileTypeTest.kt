package com.ky_proj.ij_kotlin_test.filetype

/**
 * Created on 2018/01/15.
 */
import com.ky_proj.ij_kotlin_test.filetype.SimpleFileType
import com.ky_proj.ij_kotlin_test.filetype.SimpleFileTypeFactory

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase

import org.junit.Test


class FileTypeTestCase: LightPlatformCodeInsightFixtureTestCase() {

    override fun getTestDataPath(): String {
        return "/testData.filetype"
    }

    @Test
    fun testFileTypeRecognition(){
        assertEquals("Hello World!", "hpge")
    }


}

/*class FileTypeTest :Spek ({
    val test_case :FileTypeTestCase = FileTypeTestCase()

    given("filetype"){
        beforeGroup {
            test_case.setup()
        }

        on("*.simple file"){
            it("should recognize the file as 'Simple' file"){
                assertEquals("Hello World!", "hpge")
            }
        }

    }



})*/