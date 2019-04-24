public class android.support.design.widget.AppBarLayout$Behavior$b extends android.support.v4.view.a {
  public static final android.os.Parcelable$Creator<android.support.design.widget.AppBarLayout$Behavior$b> CREATOR;

  int a;

  float b;

  boolean c;

  static {};
    Code:
       0: new           #12                 // class android/support/design/widget/AppBarLayout$Behavior$b$1
       3: dup
       4: invokespecial #25                 // Method android/support/design/widget/AppBarLayout$Behavior$b$1."<init>":()V
       7: putstatic     #27                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public android.support.design.widget.AppBarLayout$Behavior$b(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #31                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
       6: aload_0
       7: aload_1
       8: invokevirtual #37                 // Method android/os/Parcel.readInt:()I
      11: putfield      #39                 // Field a:I
      14: aload_0
      15: aload_1
      16: invokevirtual #43                 // Method android/os/Parcel.readFloat:()F
      19: putfield      #45                 // Field b:F
      22: aload_1
      23: invokevirtual #49                 // Method android/os/Parcel.readByte:()B
      26: ifeq          34
      29: iconst_1
      30: istore_3
      31: goto          36
      34: iconst_0
      35: istore_3
      36: aload_0
      37: iload_3
      38: putfield      #51                 // Field c:Z
      41: return

  public android.support.design.widget.AppBarLayout$Behavior$b(android.os.Parcelable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #54                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcelable;)V
       5: return

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #58                 // Method android/support/v4/view/a.writeToParcel:(Landroid/os/Parcel;I)V
       6: aload_1
       7: aload_0
       8: getfield      #39                 // Field a:I
      11: invokevirtual #62                 // Method android/os/Parcel.writeInt:(I)V
      14: aload_1
      15: aload_0
      16: getfield      #45                 // Field b:F
      19: invokevirtual #66                 // Method android/os/Parcel.writeFloat:(F)V
      22: aload_1
      23: aload_0
      24: getfield      #51                 // Field c:Z
      27: i2b
      28: invokevirtual #70                 // Method android/os/Parcel.writeByte:(B)V
      31: return
}
