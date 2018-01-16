package com.ky_proj.ij_kotlin_test.filetype

/**
 * Created on 2018/01/15.
 */

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase
import org.junit.Test


class FileTypeTest: LightPlatformCodeInsightFixtureTestCase() {

    override fun getTestDataPath(): String {
        return "src/test/resources/testData/filetype"
    }

    @Test
    fun testFileTypeRecognition(){
        val file = myFixture.copyFileToProject("FileTypeTest.simple")
        assertEquals(file.fileType.name, "Simple file")
    }


}
