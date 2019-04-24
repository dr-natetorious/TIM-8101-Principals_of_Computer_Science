public abstract class ryey.easer.plugins.operation.d extends ryey.easer.plugins.b.f implements ryey.easer.commons.local_plugin.c.b {
  protected ryey.easer.plugins.operation.d(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method ryey/easer/plugins/b/f."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #19                 // Method android/os/Parcel.readString:()Ljava/lang/String;
       9: putfield      #23                 // Field a:Ljava/lang/String;
      12: return

  protected ryey.easer.plugins.operation.d(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #27                 // Method ryey/easer/plugins/b/f."<init>":(Ljava/lang/String;)V
       5: return

  public ryey.easer.plugins.operation.d(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method ryey/easer/plugins/b/f."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #30                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #34                 // Field ryey/easer/plugins/operation/d$1.a:[I
       3: aload_1
       4: invokevirtual #40                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: aload_0
      10: invokevirtual #43                 // Method c:()Ljava/lang/String;
      13: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #34                 // Field ryey/easer/plugins/operation/d$1.a:[I
       3: aload_2
       4: invokevirtual #40                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: aload_0
      10: aload_1
      11: invokevirtual #45                 // Method a:(Ljava/lang/String;)V
      14: return

  public java.util.Set<java.lang.String> b();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Ljava/lang/String;
       4: invokestatic  #52                 // Method ryey/easer/b.c:(Ljava/lang/String;)Ljava/util/Set;
       7: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #23                 // Field a:Ljava/lang/String;
       5: invokevirtual #60                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: return
}
