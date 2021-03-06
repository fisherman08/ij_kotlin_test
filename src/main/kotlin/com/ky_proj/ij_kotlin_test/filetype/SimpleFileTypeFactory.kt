package com.ky_proj.ij_kotlin_test.filetype

/**
 * Created on 2018/01/14.
 */

import com.intellij.openapi.fileTypes.*
import com.ky_proj.ij_kotlin_test.filetype.SimpleFileType

class SimpleFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(fileTypeConsumer: FileTypeConsumer) {
        fileTypeConsumer.consume(SimpleFileType.INSTANCE, "simple")
    }
}