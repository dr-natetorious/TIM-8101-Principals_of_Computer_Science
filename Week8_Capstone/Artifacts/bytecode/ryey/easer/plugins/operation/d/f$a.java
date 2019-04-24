class ryey.easer.plugins.operation.d.f$a implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.d.f$a> CREATOR;

  final java.lang.String a;

  final java.lang.String b;

  final java.lang.String c;

  static {};
    Code:
       0: new           #11                 // class ryey/easer/plugins/operation/d/f$a$1
       3: dup
       4: invokespecial #22                 // Method ryey/easer/plugins/operation/d/f$a$1."<init>":()V
       7: putstatic     #24                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.d.f$a(android.os.Parcel, ryey.easer.plugins.operation.d.f$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #42                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.d.f$a(java.lang.String, java.lang.String, java.lang.String);
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

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #2                  // class ryey/easer/plugins/operation/d/f$a
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #35                 // Field a:Ljava/lang/String;
      20: astore_2
      21: aload_1
      22: checkcast     #2                  // class ryey/easer/plugins/operation/d/f$a
      25: astore_1
      26: aload_2
      27: aload_1
      28: getfield      #35                 // Field a:Ljava/lang/String;
      31: invokevirtual #51                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      34: ifne          39
      37: iconst_0
      38: ireturn
      39: aload_0
      40: getfield      #37                 // Field b:Ljava/lang/String;
      43: aload_1
      44: getfield      #37                 // Field b:Ljava/lang/String;
      47: invokevirtual #51                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      50: ifne          55
      53: iconst_0
      54: ireturn
      55: aload_0
      56: getfield      #39                 // Field c:Ljava/lang/String;
      59: aload_1
      60: getfield      #39                 // Field c:Ljava/lang/String;
      63: invokevirtual #51                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      66: ifne          71
      69: iconst_0
      70: ireturn
      71: iconst_1
      72: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #35                 // Field a:Ljava/lang/String;
       5: invokevirtual #57                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #37                 // Field b:Ljava/lang/String;
      13: invokevirtual #57                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      16: aload_1
      17: aload_0
      18: getfield      #39                 // Field c:Ljava/lang/String;
      21: invokevirtual #57                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      24: return
}
