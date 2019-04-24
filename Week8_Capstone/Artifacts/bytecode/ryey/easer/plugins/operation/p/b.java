public class ryey.easer.plugins.operation.p.b implements ryey.easer.commons.local_plugin.c.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.p.b> CREATOR;

  ryey.easer.plugins.operation.p.b$a a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/operation/p/b$1
       3: dup
       4: invokespecial #20                 // Method ryey/easer/plugins/operation/p/b$1."<init>":()V
       7: putstatic     #22                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.p.b(android.os.Parcel, ryey.easer.plugins.operation.p.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #40                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.p.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #45                 // Method ryey/easer/plugins/operation/p/b$a.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/operation/p/b$a;
       9: putfield      #37                 // Field a:Lryey/easer/plugins/operation/p/b$a;
      12: return

  ryey.easer.plugins.operation.p.b(ryey.easer.plugins.operation.p.b$a);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #37                 // Field a:Lryey/easer/plugins/operation/p/b$a;
       9: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: aload_0
       1: getfield      #37                 // Field a:Lryey/easer/plugins/operation/p/b$a;
       4: invokevirtual #51                 // Method ryey/easer/plugins/operation/p/b$a.name:()Ljava/lang/String;
       7: areturn

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #37                 // Field a:Lryey/easer/plugins/operation/p/b$a;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public java.util.Set<java.lang.String> b();
    Code:
       0: aconst_null
       1: areturn

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
      12: instanceof    #2                  // class ryey/easer/plugins/operation/p/b
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #37                 // Field a:Lryey/easer/plugins/operation/p/b$a;
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/operation/p/b
      28: getfield      #37                 // Field a:Lryey/easer/plugins/operation/p/b$a;
      31: if_acmpne     36
      34: iconst_1
      35: ireturn
      36: iconst_0
      37: ireturn
      38: iconst_0
      39: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #37                 // Field a:Lryey/easer/plugins/operation/p/b$a;
       5: invokevirtual #65                 // Method ryey/easer/plugins/operation/p/b$a.ordinal:()I
       8: invokevirtual #69                 // Method android/os/Parcel.writeInt:(I)V
      11: return
}
