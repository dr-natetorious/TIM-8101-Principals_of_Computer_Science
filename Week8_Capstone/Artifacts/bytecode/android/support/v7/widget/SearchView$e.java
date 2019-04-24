class android.support.v7.widget.SearchView$e extends android.support.v4.view.a {
  public static final android.os.Parcelable$Creator<android.support.v7.widget.SearchView$e> CREATOR;

  boolean a;

  static {};
    Code:
       0: new           #9                  // class android/support/v7/widget/SearchView$e$1
       3: dup
       4: invokespecial #19                 // Method android/support/v7/widget/SearchView$e$1."<init>":()V
       7: putstatic     #21                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public android.support.v7.widget.SearchView$e(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #25                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
       6: aload_0
       7: aload_1
       8: aconst_null
       9: invokevirtual #31                 // Method android/os/Parcel.readValue:(Ljava/lang/ClassLoader;)Ljava/lang/Object;
      12: checkcast     #33                 // class java/lang/Boolean
      15: invokevirtual #37                 // Method java/lang/Boolean.booleanValue:()Z
      18: putfield      #39                 // Field a:Z
      21: return

  android.support.v7.widget.SearchView$e(android.os.Parcelable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #42                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcelable;)V
       5: return

  public java.lang.String toString();
    Code:
       0: new           #46                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #47                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #49                 // String SearchView.SavedState{
      11: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: invokestatic  #59                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      20: invokestatic  #65                 // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      23: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #67                 // String  isIconified=
      30: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: aload_0
      36: getfield      #39                 // Field a:Z
      39: invokevirtual #70                 // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
      42: pop
      43: aload_1
      44: ldc           #72                 // String }
      46: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      49: pop
      50: aload_1
      51: invokevirtual #74                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      54: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #78                 // Method android/support/v4/view/a.writeToParcel:(Landroid/os/Parcel;I)V
       6: aload_1
       7: aload_0
       8: getfield      #39                 // Field a:Z
      11: invokestatic  #82                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      14: invokevirtual #86                 // Method android/os/Parcel.writeValue:(Ljava/lang/Object;)V
      17: return
}
