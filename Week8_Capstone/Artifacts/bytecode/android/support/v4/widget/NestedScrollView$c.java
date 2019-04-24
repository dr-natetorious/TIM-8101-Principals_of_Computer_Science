class android.support.v4.widget.NestedScrollView$c extends android.view.View$BaseSavedState {
  public static final android.os.Parcelable$Creator<android.support.v4.widget.NestedScrollView$c> CREATOR;

  public int a;

  static {};
    Code:
       0: new           #9                  // class android/support/v4/widget/NestedScrollView$c$1
       3: dup
       4: invokespecial #19                 // Method android/support/v4/widget/NestedScrollView$c$1."<init>":()V
       7: putstatic     #21                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.widget.NestedScrollView$c(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #25                 // Method android/view/View$BaseSavedState."<init>":(Landroid/os/Parcel;)V
       5: aload_0
       6: aload_1
       7: invokevirtual #31                 // Method android/os/Parcel.readInt:()I
      10: putfield      #33                 // Field a:I
      13: return

  android.support.v4.widget.NestedScrollView$c(android.os.Parcelable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #36                 // Method android/view/View$BaseSavedState."<init>":(Landroid/os/Parcelable;)V
       5: return

  public java.lang.String toString();
    Code:
       0: new           #40                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #41                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #43                 // String HorizontalScrollView.SavedState{
      11: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: invokestatic  #53                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      20: invokestatic  #59                 // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      23: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #61                 // String  scrollPosition=
      30: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: aload_0
      36: getfield      #33                 // Field a:I
      39: invokevirtual #64                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      42: pop
      43: aload_1
      44: ldc           #66                 // String }
      46: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      49: pop
      50: aload_1
      51: invokevirtual #68                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      54: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #72                 // Method android/view/View$BaseSavedState.writeToParcel:(Landroid/os/Parcel;I)V
       6: aload_1
       7: aload_0
       8: getfield      #33                 // Field a:I
      11: invokevirtual #76                 // Method android/os/Parcel.writeInt:(I)V
      14: return
}
