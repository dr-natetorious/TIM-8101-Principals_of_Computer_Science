public abstract class ryey.easer.plugins.operation.b extends ryey.easer.plugins.b.c implements ryey.easer.commons.local_plugin.c.b {
  protected ryey.easer.plugins.operation.b(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method ryey/easer/plugins/b/c."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #19                 // Method android/os/Parcel.readInt:()I
       9: invokestatic  #25                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      12: putfield      #29                 // Field a:Ljava/lang/Integer;
      15: return

  protected ryey.easer.plugins.operation.b(java.lang.Integer);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #33                 // Method ryey/easer/plugins/b/c."<init>":(Ljava/lang/Integer;)V
       5: return

  public ryey.easer.plugins.operation.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method ryey/easer/plugins/b/c."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #36                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #40                 // Field ryey/easer/plugins/operation/b$1.a:[I
       3: aload_1
       4: invokevirtual #45                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: aload_0
      10: invokevirtual #49                 // Method d:()Ljava/lang/Integer;
      13: invokevirtual #53                 // Method java/lang/Integer.toString:()Ljava/lang/String;
      16: areturn

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #40                 // Field ryey/easer/plugins/operation/b$1.a:[I
       3: aload_2
       4: invokevirtual #45                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: aload_0
      10: aload_1
      11: invokestatic  #57                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
      14: invokevirtual #60                 // Method java/lang/Integer.intValue:()I
      17: invokevirtual #63                 // Method a:(I)V
      20: return

  public java.util.Set<java.lang.String> b();
    Code:
       0: aconst_null
       1: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #29                 // Field a:Ljava/lang/Integer;
       5: invokevirtual #60                 // Method java/lang/Integer.intValue:()I
       8: invokevirtual #73                 // Method android/os/Parcel.writeInt:(I)V
      11: return
}
