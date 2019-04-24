class ryey.easer.plugins.event.l.e implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.l.e> CREATOR;

  java.lang.String a;

  java.lang.String b;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/event/l/e$1
       3: dup
       4: invokespecial #19                 // Method ryey/easer/plugins/event/l/e$1."<init>":()V
       7: putstatic     #21                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.l.e();
    Code:
       0: aload_0
       1: invokespecial #23                 // Method java/lang/Object."<init>":()V
       4: return

  ryey.easer.plugins.event.l.e(android.os.Parcel, ryey.easer.plugins.event.l.e$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #37                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

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
       8: instanceof    #2                  // class ryey/easer/plugins/event/l/e
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #32                 // Field a:Ljava/lang/String;
      20: astore_2
      21: aload_1
      22: checkcast     #2                  // class ryey/easer/plugins/event/l/e
      25: astore_1
      26: aload_2
      27: aload_1
      28: getfield      #32                 // Field a:Ljava/lang/String;
      31: invokestatic  #46                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      34: ifne          39
      37: iconst_0
      38: ireturn
      39: aload_0
      40: getfield      #34                 // Field b:Ljava/lang/String;
      43: aload_1
      44: getfield      #34                 // Field b:Ljava/lang/String;
      47: invokestatic  #46                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      50: ifne          55
      53: iconst_0
      54: ireturn
      55: iconst_1
      56: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #32                 // Field a:Ljava/lang/String;
       5: invokevirtual #52                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #34                 // Field b:Ljava/lang/String;
      13: invokevirtual #52                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      16: return
}
