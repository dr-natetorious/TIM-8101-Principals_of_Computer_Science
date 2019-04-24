public abstract class ryey.easer.plugins.operation.a extends ryey.easer.plugins.b.a implements ryey.easer.commons.local_plugin.c.b {
  protected ryey.easer.plugins.operation.a();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method ryey/easer/plugins/b/a."<init>":()V
       4: return

  protected ryey.easer.plugins.operation.a(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #12                 // Method ryey/easer/plugins/b/a."<init>":()V
       4: aload_1
       5: invokevirtual #20                 // Method android/os/Parcel.readByte:()B
       8: ifeq          16
      11: iconst_1
      12: istore_2
      13: goto          18
      16: iconst_0
      17: istore_2
      18: aload_0
      19: iload_2
      20: invokestatic  #26                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      23: putfield      #30                 // Field a:Ljava/lang/Boolean;
      26: return

  protected ryey.easer.plugins.operation.a(java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #33                 // Method ryey/easer/plugins/b/a."<init>":(Ljava/lang/Boolean;)V
       5: return

  public ryey.easer.plugins.operation.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #12                 // Method ryey/easer/plugins/b/a."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #36                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #40                 // Field ryey/easer/plugins/operation/a$1.a:[I
       3: aload_1
       4: invokevirtual #46                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: aload_0
      10: invokevirtual #50                 // Method c:()Ljava/lang/Boolean;
      13: invokevirtual #54                 // Method java/lang/Boolean.booleanValue:()Z
      16: ifeq          22
      19: ldc           #56                 // String on
      21: areturn
      22: ldc           #58                 // String off
      24: areturn

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #40                 // Field ryey/easer/plugins/operation/a$1.a:[I
       3: aload_2
       4: invokevirtual #46                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: iconst_m1
      10: istore_3
      11: aload_1
      12: invokevirtual #64                 // Method java/lang/String.hashCode:()I
      15: istore        4
      17: iload         4
      19: sipush        3551
      22: if_icmpeq     49
      25: iload         4
      27: ldc           #65                 // int 109935
      29: if_icmpeq     35
      32: goto          60
      35: aload_1
      36: ldc           #58                 // String off
      38: invokevirtual #69                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      41: ifeq          60
      44: iconst_1
      45: istore_3
      46: goto          60
      49: aload_1
      50: ldc           #56                 // String on
      52: invokevirtual #69                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      55: ifeq          60
      58: iconst_0
      59: istore_3
      60: iload_3
      61: tableswitch   { // 0 to 1
                     0: 100
                     1: 94
               default: 84
          }
      84: new           #71                 // class ryey/easer/commons/local_plugin/b
      87: dup
      88: ldc           #73                 // String Unknown data
      90: invokespecial #76                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/String;)V
      93: athrow
      94: aload_0
      95: iconst_0
      96: invokevirtual #79                 // Method a:(Z)V
      99: return
     100: aload_0
     101: iconst_1
     102: invokevirtual #79                 // Method a:(Z)V
     105: return

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
       2: getfield      #30                 // Field a:Ljava/lang/Boolean;
       5: invokevirtual #54                 // Method java/lang/Boolean.booleanValue:()Z
       8: i2b
       9: invokevirtual #90                 // Method android/os/Parcel.writeByte:(B)V
      12: return
}
