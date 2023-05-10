<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:background="@color/bg_register"
        android:gravity="center"
        android:orientation="vertical"
        android:padding="10dp" >

<LinearLayout
        android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:orientation="vertical"
                android:paddingLeft="20dp"
                android:paddingRight="20dp">

<EditText
            android:id="@+id/et_id"
                    android:layout_width="fill_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginBottom="10dp"
                    android:background="@color/input_register_bg"
                    android:hint="@string/hint_id"
                    android:inputType="textCapWords"
                    android:padding="10dp"
                    android:textColor="@color/input_register"
                    android:textColorHint="@color/input_register_hint" />

<EditText
            android:id="@+id/et_pass"
                    android:layout_width="fill_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginBottom="10dp"
                    android:background="@color/input_register_bg"
                    android:hint="@string/hint_password"
                    android:inputType="textEmailAddress"
                    android:padding="10dp"
                    android:textColor="@color/input_register"
                    android:textColorHint="@color/input_register_hint" />

<Button
            android:id="@+id/btn_login"
                    android:layout_width="fill_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="20dip"
                    android:background="#ea4c88"
                    android:text="@string/btn_login"
                    android:textColor="@color/white" />

<Button
            android:id="@+id/btn_register"
                    android:layout_width="fill_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="20dip"
                    android:background="#ea4c88"
                    android:text="@string/btn_register"
                    android:textColor="@color/white" />

</LinearLayout>
</LinearLayout>