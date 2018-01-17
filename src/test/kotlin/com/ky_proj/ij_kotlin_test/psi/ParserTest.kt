package com.ky_proj.ij_kotlin_test.psi

import com.intellij.psi.PsiManager
import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase
import org.junit.Test
import com.ky_proj.ij_kotlin_test.psi.*
import com.intellij.psi.util.*

class ParserTest: LightPlatformCodeInsightFixtureTestCase() {

    override fun getTestDataPath(): String {
        return "src/test/resources/testData/psi"
    }

    @Test
    fun testParseProperty(){
        val virtual_file = myFixture.copyFileToProject("PsiTest.simple")
        val psi_file = PsiManager.getInstance(project).findFile(virtual_file)
        val first_child = psi_file?.firstChild
        assertEquals(first_child?.node?.elementType ?: "null", SimpleTypes.PROPERTY)

    }


}
