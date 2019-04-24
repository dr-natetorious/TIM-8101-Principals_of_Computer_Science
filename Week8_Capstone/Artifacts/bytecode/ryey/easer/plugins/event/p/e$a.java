class ryey.easer.plugins.event.p.e$a implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.p.e$a> CREATOR;

  final java.lang.String a;

  final java.lang.String b;

  static {};
    Code:
       0: new           #11                 // class ryey/easer/plugins/event/p/e$a$1
       3: dup
       4: invokespecial #21                 // Method ryey/easer/plugins/event/p/e$a$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.p.e$a(android.os.Parcel, ryey.easer.plugins.event.p.e$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #39                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.p.e$a(java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #34                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_2
      11: putfield      #36                 // Field b:Ljava/lang/String;
      14: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public java.lang.String toString();
    Code:
       0: ldc           #45                 // String %s\n[%s]
       2: iconst_2
       3: anewarray     #4                  // class java/lang/Object
       6: dup
       7: iconst_0
       8: aload_0
       9: getfield      #34                 // Field a:Ljava/lang/String;
      12: aastore
      13: dup
      14: iconst_1
      15: aload_0
      16: getfield      #36                 // Field b:Ljava/lang/String;
      19: aastore
      20: invokestatic  #51                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      23: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #34                 // Field a:Ljava/lang/String;
       5: invokevirtual #57                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #36                 // Field b:Ljava/lang/String;
      13: invokevirtual #57                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      16: return
}
