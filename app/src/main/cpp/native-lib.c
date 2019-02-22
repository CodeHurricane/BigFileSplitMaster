#include "ndk_file_patch.h"
JNIEXPORT void JNICALL
Java_com_example_user_bigfilesplit_1master_NDKFileUtils_diff(JNIEnv *env, jclass type,
                                                             jstring path_, jstring path_pattern_,
                                                             jint count) {
    c_differ(env,type,path_,path_pattern_,count);
}

JNIEXPORT void JNICALL
Java_com_example_user_bigfilesplit_1master_NDKFileUtils_patch(JNIEnv *env, jclass type,
                                                              jstring path_pattern_, jint count,
                                                              jstring merge_path_) {
c_patch(env,type,path_pattern_,count,merge_path_);

}