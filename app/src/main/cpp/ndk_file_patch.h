//
// Created by user on 2019/2/22.
//
#include "jni.h"
#ifndef BIGFILESPLITMASTER_NDK_FILE_PATCH_H
#define BIGFILESPLITMASTER_NDK_FILE_PATCH_H

void c_differ(JNIEnv *env, jclass jcls, jstring path_jstr,jstring path_pattern_jstr, jint file_num);

void c_patch(JNIEnv *env, jclass jcls,jstring path_pattern_jstr, jint file_num,jstring merge_path_jstr);
#endif //BIGFILESPLITMASTER_NDK_FILE_PATCH_H
