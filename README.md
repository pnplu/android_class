# android_class
in classroom

### Recomend
- [Java SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Android Studio](https://developer.android.com/studio/index.html)
- [VirtualBox](https://www.virtualbox.org/wiki/Downloads)
- [Genymotion](https://www.genymotion.com/download/)
- **Genymotion need VirtualBox**

### 01 / Hello World
- First time and Calculate 2 number in application ( need Genymotion )

### 02/UiFirst
- Calculate Layout in class
**Error with AlignBottom @id/five**
```
<LinearLayout
        android:id="@+id/LNLEqual"
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:layout_below="@id/LNLFirst"
        android:layout_alignParentRight="true"
        android:layout_alignBottom="@id/LNLFive"
        >
        <Button
            android:id="@+id/BTNEqual"
            android:layout_width="wrap_content"
            android:layout_height="70dp"
            android:text="="
            android:textSize="25sp"
            android:layout_weight="25"
            />

    </LinearLayout>
```
