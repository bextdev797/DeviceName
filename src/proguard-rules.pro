# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.bextdev.DeviceName.DeviceName {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/bextdev/DeviceName/repack'
-flattenpackagehierarchy
-dontpreverify
