public class ryey.easer.plugins.operation.ringer_mode.c implements ryey.easer.commons.local_plugin.c.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.ringer_mode.c> CREATOR;

  ryey.easer.plugins.operation.ringer_mode.a a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/operation/ringer_mode/c$1
       3: dup
       4: invokespecial #20                 // Method ryey/easer/plugins/operation/ringer_mode/c$1."<init>":()V
       7: putstatic     #22                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.ringer_mode.c(android.os.Parcel, ryey.easer.plugins.operation.ringer_mode.c$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #38                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.ringer_mode.c(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #41                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  ryey.easer.plugins.operation.ringer_mode.c(ryey.easer.plugins.operation.ringer_mode.a);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #35                 // Field a:Lryey/easer/plugins/operation/ringer_mode/a;
       9: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #46                 // Field ryey/easer/plugins/operation/ringer_mode/c$2.a:[I
       3: aload_1
       4: invokevirtual #52                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: aload_0
      10: getfield      #35                 // Field a:Lryey/easer/plugins/operation/ringer_mode/a;
      13: invokestatic  #55                 // Method ryey/easer/plugins/operation/ringer_mode/a.a:(Lryey/easer/plugins/operation/ringer_mode/a;)Lryey/easer/plugins/operation/ringer_mode/a;
      16: invokevirtual #59                 // Method ryey/easer/plugins/operation/ringer_mode/a.name:()Ljava/lang/String;
      19: areturn

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #46                 // Field ryey/easer/plugins/operation/ringer_mode/c$2.a:[I
       3: aload_2
       4: invokevirtual #52                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore        4
      10: iload_3
      11: bipush        6
      13: if_icmpge     94
      16: aload_1
      17: invokestatic  #66                 // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
      20: invokevirtual #69                 // Method java/lang/Integer.intValue:()I
      23: tableswitch   { // 0 to 2
                     0: 72
                     1: 65
                     2: 58
               default: 48
          }
      48: new           #71                 // class java/lang/IllegalStateException
      51: dup
      52: ldc           #73                 // String Compatibility for RingerMode shouldn't run out of cases
      54: invokespecial #76                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      57: athrow
      58: getstatic     #77                 // Field ryey/easer/plugins/operation/ringer_mode/a.a:Lryey/easer/plugins/operation/ringer_mode/a;
      61: astore_1
      62: goto          99
      65: getstatic     #80                 // Field ryey/easer/plugins/operation/ringer_mode/a.b:Lryey/easer/plugins/operation/ringer_mode/a;
      68: astore_1
      69: goto          99
      72: getstatic     #86                 // Field android/os/Build$VERSION.SDK_INT:I
      75: bipush        21
      77: if_icmpge     87
      80: getstatic     #89                 // Field ryey/easer/plugins/operation/ringer_mode/a.c:Lryey/easer/plugins/operation/ringer_mode/a;
      83: astore_1
      84: goto          99
      87: getstatic     #92                 // Field ryey/easer/plugins/operation/ringer_mode/a.f:Lryey/easer/plugins/operation/ringer_mode/a;
      90: astore_1
      91: goto          99
      94: aload_1
      95: invokestatic  #95                 // Method ryey/easer/plugins/operation/ringer_mode/a.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/operation/ringer_mode/a;
      98: astore_1
      99: aload_0
     100: aload_1
     101: putfield      #35                 // Field a:Lryey/easer/plugins/operation/ringer_mode/a;
     104: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #35                 // Field a:Lryey/easer/plugins/operation/ringer_mode/a;
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
       8: instanceof    #2                  // class ryey/easer/plugins/operation/ringer_mode/c
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #35                 // Field a:Lryey/easer/plugins/operation/ringer_mode/a;
      20: aload_1
      21: checkcast     #2                  // class ryey/easer/plugins/operation/ringer_mode/c
      24: getfield      #35                 // Field a:Lryey/easer/plugins/operation/ringer_mode/a;
      27: invokestatic  #107                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      30: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #35                 // Field a:Lryey/easer/plugins/operation/ringer_mode/a;
       5: invokevirtual #113                // Method android/os/Parcel.writeSerializable:(Ljava/io/Serializable;)V
       8: return
}
