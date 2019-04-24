public abstract class android.support.v4.view.a implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.view.a> CREATOR;

  public static final android.support.v4.view.a d;

  static {};
    Code:
       0: new           #8                  // class android/support/v4/view/a$1
       3: dup
       4: invokespecial #22                 // Method android/support/v4/view/a$1."<init>":()V
       7: putstatic     #24                 // Field d:Landroid/support/v4/view/a;
      10: new           #10                 // class android/support/v4/view/a$2
      13: dup
      14: invokespecial #25                 // Method android/support/v4/view/a$2."<init>":()V
      17: putstatic     #27                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      20: return

  protected android.support.v4.view.a(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method java/lang/Object."<init>":()V
       4: aload_1
       5: aload_2
       6: invokevirtual #38                 // Method android/os/Parcel.readParcelable:(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
       9: astore_1
      10: aload_1
      11: ifnull        17
      14: goto          21
      17: getstatic     #24                 // Field d:Landroid/support/v4/view/a;
      20: astore_1
      21: aload_0
      22: aload_1
      23: putfield      #31                 // Field a:Landroid/os/Parcelable;
      26: return

  protected android.support.v4.view.a(android.os.Parcelable);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method java/lang/Object."<init>":()V
       4: aload_1
       5: ifnonnull     18
       8: new           #41                 // class java/lang/IllegalArgumentException
      11: dup
      12: ldc           #43                 // String superState must not be null
      14: invokespecial #46                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_1
      19: getstatic     #24                 // Field d:Landroid/support/v4/view/a;
      22: if_acmpeq     28
      25: goto          30
      28: aconst_null
      29: astore_1
      30: aload_0
      31: aload_1
      32: putfield      #31                 // Field a:Landroid/os/Parcelable;
      35: return

  android.support.v4.view.a(android.support.v4.view.a$1);
    Code:
       0: aload_0
       1: invokespecial #48                 // Method "<init>":()V
       4: return

  public final android.os.Parcelable a();
    Code:
       0: aload_0
       1: getfield      #31                 // Field a:Landroid/os/Parcelable;
       4: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #31                 // Field a:Landroid/os/Parcelable;
       5: iload_2
       6: invokevirtual #57                 // Method android/os/Parcel.writeParcelable:(Landroid/os/Parcelable;I)V
       9: return
}
