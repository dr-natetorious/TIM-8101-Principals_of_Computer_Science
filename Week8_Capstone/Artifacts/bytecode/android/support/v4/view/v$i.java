public class android.support.v4.view.v$i extends android.support.v4.view.a {
  public static final android.os.Parcelable$Creator<android.support.v4.view.v$i> CREATOR;

  int a;

  android.os.Parcelable b;

  java.lang.ClassLoader c;

  static {};
    Code:
       0: new           #9                  // class android/support/v4/view/v$i$1
       3: dup
       4: invokespecial #23                 // Method android/support/v4/view/v$i$1."<init>":()V
       7: putstatic     #25                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.view.v$i(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #29                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
       6: aload_2
       7: astore_3
       8: aload_2
       9: ifnonnull     20
      12: aload_0
      13: invokevirtual #35                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      16: invokevirtual #41                 // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
      19: astore_3
      20: aload_0
      21: aload_1
      22: invokevirtual #47                 // Method android/os/Parcel.readInt:()I
      25: putfield      #49                 // Field a:I
      28: aload_0
      29: aload_1
      30: aload_3
      31: invokevirtual #53                 // Method android/os/Parcel.readParcelable:(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
      34: putfield      #55                 // Field b:Landroid/os/Parcelable;
      37: aload_0
      38: aload_3
      39: putfield      #57                 // Field c:Ljava/lang/ClassLoader;
      42: return

  public android.support.v4.view.v$i(android.os.Parcelable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #60                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcelable;)V
       5: return

  public java.lang.String toString();
    Code:
       0: new           #64                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #65                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #67                 // String FragmentPager.SavedState{
      11: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: invokestatic  #77                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      20: invokestatic  #83                 // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      23: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #85                 // String  position=
      30: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: aload_0
      36: getfield      #49                 // Field a:I
      39: invokevirtual #88                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      42: pop
      43: aload_1
      44: ldc           #90                 // String }
      46: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      49: pop
      50: aload_1
      51: invokevirtual #92                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      54: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #96                 // Method android/support/v4/view/a.writeToParcel:(Landroid/os/Parcel;I)V
       6: aload_1
       7: aload_0
       8: getfield      #49                 // Field a:I
      11: invokevirtual #100                // Method android/os/Parcel.writeInt:(I)V
      14: aload_1
      15: aload_0
      16: getfield      #55                 // Field b:Landroid/os/Parcelable;
      19: iload_2
      20: invokevirtual #104                // Method android/os/Parcel.writeParcelable:(Landroid/os/Parcelable;I)V
      23: return
}
