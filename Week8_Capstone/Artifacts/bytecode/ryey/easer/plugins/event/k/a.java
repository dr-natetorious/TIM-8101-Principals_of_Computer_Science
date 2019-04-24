public class ryey.easer.plugins.event.k.a extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.k.a> CREATOR;

  final ryey.easer.plugins.event.k.a$a a;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/k/a$1
       3: dup
       4: invokespecial #20                 // Method ryey/easer/plugins/event/k/a$1."<init>":()V
       7: putstatic     #22                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.k.a(android.os.Parcel, ryey.easer.plugins.event.k.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #40                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.k.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #45                 // Method ryey/easer/plugins/event/k/a$a.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/event/k/a$a;
       9: putfield      #37                 // Field a:Lryey/easer/plugins/event/k/a$a;
      12: return

  ryey.easer.plugins.event.k.a(ryey.easer.plugins.event.k.a$a);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #37                 // Field a:Lryey/easer/plugins/event/k/a$a;
       9: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #50                 // Field ryey/easer/plugins/event/k/a$2.a:[I
       3: aload_1
       4: invokevirtual #55                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: aload_0
      10: getfield      #37                 // Field a:Lryey/easer/plugins/event/k/a$a;
      13: invokevirtual #59                 // Method ryey/easer/plugins/event/k/a$a.name:()Ljava/lang/String;
      16: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #37                 // Field a:Lryey/easer/plugins/event/k/a$a;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: iconst_1
      10: ireturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public ryey.easer.commons.local_plugin.b.a[] dynamics();
    Code:
       0: aconst_null
       1: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        34
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/plugins/event/k/a
       8: ifne          13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: getfield      #37                 // Field a:Lryey/easer/plugins/event/k/a$a;
      17: aload_1
      18: checkcast     #2                  // class ryey/easer/plugins/event/k/a
      21: getfield      #37                 // Field a:Lryey/easer/plugins/event/k/a$a;
      24: invokevirtual #67                 // Method ryey/easer/plugins/event/k/a$a.equals:(Ljava/lang/Object;)Z
      27: ifne          32
      30: iconst_0
      31: ireturn
      32: iconst_1
      33: ireturn
      34: iconst_0
      35: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: getfield      #37                 // Field a:Lryey/easer/plugins/event/k/a$a;
       4: invokevirtual #70                 // Method ryey/easer/plugins/event/k/a$a.ordinal:()I
       7: pop
       8: return
}
