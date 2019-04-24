public class ryey.easer.plugins.a.i.a implements ryey.easer.commons.local_plugin.a.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.a.i.a> CREATOR;

  final ryey.easer.plugins.a.i.a$a a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/a/i/a$1
       3: dup
       4: invokespecial #22                 // Method ryey/easer/plugins/a/i/a$1."<init>":()V
       7: putstatic     #24                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.a.i.a(android.os.Parcel, ryey.easer.plugins.a.i.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #42                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.a.i.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: getstatic     #46                 // Field ryey/easer/plugins/a/i/a$2.a:[I
       7: aload_2
       8: invokevirtual #51                 // Method ryey/easer/b/a.ordinal:()I
      11: iaload
      12: istore_3
      13: aload_0
      14: aload_1
      15: invokestatic  #55                 // Method ryey/easer/plugins/a/i/a$a.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/a/i/a$a;
      18: putfield      #39                 // Field a:Lryey/easer/plugins/a/i/a$a;
      21: return

  ryey.easer.plugins.a.i.a(ryey.easer.plugins.a.i.a$a);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #39                 // Field a:Lryey/easer/plugins/a/i/a$a;
       9: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #46                 // Field ryey/easer/plugins/a/i/a$2.a:[I
       3: aload_1
       4: invokevirtual #51                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: aload_0
      10: getfield      #39                 // Field a:Lryey/easer/plugins/a/i/a$a;
      13: invokevirtual #61                 // Method ryey/easer/plugins/a/i/a$a.name:()Ljava/lang/String;
      16: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #39                 // Field a:Lryey/easer/plugins/a/i/a$a;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: iconst_1
      10: ireturn

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
       8: ifnull        41
      11: aload_1
      12: instanceof    #2                  // class ryey/easer/plugins/a/i/a
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #39                 // Field a:Lryey/easer/plugins/a/i/a$a;
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/a/i/a
      28: getfield      #39                 // Field a:Lryey/easer/plugins/a/i/a$a;
      31: invokevirtual #67                 // Method ryey/easer/plugins/a/i/a$a.equals:(Ljava/lang/Object;)Z
      34: ifne          39
      37: iconst_0
      38: ireturn
      39: iconst_1
      40: ireturn
      41: iconst_0
      42: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: getfield      #39                 // Field a:Lryey/easer/plugins/a/i/a$a;
       4: invokevirtual #70                 // Method ryey/easer/plugins/a/i/a$a.ordinal:()I
       7: pop
       8: return
}
