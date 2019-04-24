public class ryey.easer.plugins.a.l.a implements ryey.easer.commons.local_plugin.a.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.a.l.a> CREATOR;

  final boolean a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/a/l/a$1
       3: dup
       4: invokespecial #20                 // Method ryey/easer/plugins/a/l/a$1."<init>":()V
       7: putstatic     #22                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.a.l.a(android.os.Parcel, ryey.easer.plugins.a.l.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #36                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.a.l.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: getstatic     #40                 // Field ryey/easer/plugins/a/l/a$2.a:[I
       7: aload_2
       8: invokevirtual #46                 // Method ryey/easer/b/a.ordinal:()I
      11: iaload
      12: istore_3
      13: aload_0
      14: aload_1
      15: invokestatic  #52                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
      18: putfield      #33                 // Field a:Z
      21: return

  ryey.easer.plugins.a.l.a(boolean);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #33                 // Field a:Z
       9: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #40                 // Field ryey/easer/plugins/a/l/a$2.a:[I
       3: aload_1
       4: invokevirtual #46                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: aload_0
      10: getfield      #33                 // Field a:Z
      13: invokestatic  #60                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
      16: areturn

  public boolean a();
    Code:
       0: iconst_1
       1: ireturn

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
       8: ifnull        38
      11: aload_1
      12: instanceof    #2                  // class ryey/easer/plugins/a/l/a
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #33                 // Field a:Z
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/a/l/a
      28: getfield      #33                 // Field a:Z
      31: if_icmpeq     36
      34: iconst_0
      35: ireturn
      36: iconst_1
      37: ireturn
      38: iconst_0
      39: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #33                 // Field a:Z
       5: i2b
       6: invokevirtual #70                 // Method android/os/Parcel.writeByte:(B)V
       9: return
}
