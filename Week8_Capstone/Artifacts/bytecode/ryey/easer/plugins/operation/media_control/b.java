public class ryey.easer.plugins.operation.media_control.b implements ryey.easer.commons.local_plugin.c.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.media_control.b> CREATOR;

  ryey.easer.plugins.operation.media_control.b$a a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/operation/media_control/b$1
       3: dup
       4: invokespecial #22                 // Method ryey/easer/plugins/operation/media_control/b$1."<init>":()V
       7: putstatic     #24                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.media_control.b(android.os.Parcel, ryey.easer.plugins.operation.media_control.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #38                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.media_control.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #29                 // Field a:Lryey/easer/plugins/operation/media_control/b$a;
       9: aload_0
      10: aload_1
      11: aload_2
      12: iload_3
      13: invokevirtual #41                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      16: return

  ryey.easer.plugins.operation.media_control.b(ryey.easer.plugins.operation.media_control.b$a);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #29                 // Field a:Lryey/easer/plugins/operation/media_control/b$a;
       9: aload_0
      10: aload_1
      11: putfield      #29                 // Field a:Lryey/easer/plugins/operation/media_control/b$a;
      14: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #46                 // Field ryey/easer/plugins/operation/media_control/b$2.a:[I
       3: aload_1
       4: invokevirtual #52                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: aload_0
      10: getfield      #29                 // Field a:Lryey/easer/plugins/operation/media_control/b$a;
      13: invokevirtual #56                 // Method ryey/easer/plugins/operation/media_control/b$a.toString:()Ljava/lang/String;
      16: areturn

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #46                 // Field ryey/easer/plugins/operation/media_control/b$2.a:[I
       3: aload_2
       4: invokevirtual #52                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: aload_0
      10: aload_1
      11: invokestatic  #63                 // Method ryey/easer/plugins/operation/media_control/b$a.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/operation/media_control/b$a;
      14: putfield      #29                 // Field a:Lryey/easer/plugins/operation/media_control/b$a;
      17: return
      18: astore_1
      19: new           #65                 // class ryey/easer/commons/local_plugin/b
      22: dup
      23: aload_1
      24: invokespecial #68                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      27: athrow
    Exception table:
       from    to  target type
           9    17    18   Class java/lang/Exception

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lryey/easer/plugins/operation/media_control/b$a;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: iconst_1
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
       8: instanceof    #2                  // class ryey/easer/plugins/operation/media_control/b
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #29                 // Field a:Lryey/easer/plugins/operation/media_control/b$a;
      20: aload_1
      21: checkcast     #2                  // class ryey/easer/plugins/operation/media_control/b
      24: getfield      #29                 // Field a:Lryey/easer/plugins/operation/media_control/b$a;
      27: if_acmpne     32
      30: iconst_1
      31: ireturn
      32: iconst_0
      33: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #29                 // Field a:Lryey/easer/plugins/operation/media_control/b$a;
       5: invokevirtual #82                 // Method android/os/Parcel.writeSerializable:(Ljava/io/Serializable;)V
       8: return
}
