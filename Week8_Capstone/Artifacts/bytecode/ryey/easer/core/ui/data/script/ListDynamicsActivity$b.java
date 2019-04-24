class ryey.easer.core.ui.data.script.ListDynamicsActivity$b implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<ryey.easer.core.ui.data.script.ListDynamicsActivity$b> CREATOR;

  final java.lang.String a;

  final java.lang.String b;

  final java.lang.String c;

  static {};
    Code:
       0: new           #11                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$b$1
       3: dup
       4: invokespecial #22                 // Method ryey/easer/core/ui/data/script/ListDynamicsActivity$b$1."<init>":()V
       7: putstatic     #24                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.core.ui.data.script.ListDynamicsActivity$b(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #33                 // Method android/os/Parcel.readString:()Ljava/lang/String;
       9: putfield      #35                 // Field a:Ljava/lang/String;
      12: aload_0
      13: aload_1
      14: invokevirtual #33                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      17: putfield      #37                 // Field b:Ljava/lang/String;
      20: aload_0
      21: aload_1
      22: invokevirtual #33                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      25: putfield      #39                 // Field c:Ljava/lang/String;
      28: return

  ryey.easer.core.ui.data.script.ListDynamicsActivity$b(java.lang.String, java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #35                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_2
      11: putfield      #37                 // Field b:Ljava/lang/String;
      14: aload_0
      15: aload_3
      16: putfield      #39                 // Field c:Ljava/lang/String;
      19: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #35                 // Field a:Ljava/lang/String;
       5: invokevirtual #48                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #37                 // Field b:Ljava/lang/String;
      13: invokevirtual #48                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      16: aload_1
      17: aload_0
      18: getfield      #39                 // Field c:Ljava/lang/String;
      21: invokevirtual #48                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      24: return
}
