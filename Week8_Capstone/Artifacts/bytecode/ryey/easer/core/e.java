public final class ryey.easer.core.e extends ryey.easer.core.g {
  public static final ryey.easer.core.e$a CREATOR;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/core/e$a
       3: dup
       4: aconst_null
       5: invokespecial #16                 // Method ryey/easer/core/e$a."<init>":(La/b/b/a;)V
       8: putstatic     #18                 // Field CREATOR:Lryey/easer/core/e$a;
      11: return

  public ryey.easer.core.e(android.os.Parcel);
    Code:
       0: aload_1
       1: ldc           #22                 // String parcel
       3: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_1
       7: invokevirtual #34                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      10: astore_2
      11: aload_2
      12: ldc           #36                 // String parcel.readString()
      14: invokestatic  #38                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      17: aload_1
      18: invokevirtual #34                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      21: astore_3
      22: aload_3
      23: ldc           #36                 // String parcel.readString()
      25: invokestatic  #38                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      28: aload_1
      29: invokevirtual #34                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      32: astore        4
      34: aload         4
      36: ldc           #36                 // String parcel.readString()
      38: invokestatic  #38                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      41: aload_1
      42: invokevirtual #34                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      45: astore        5
      47: aload_1
      48: invokevirtual #34                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      51: astore_1
      52: aload_1
      53: ldc           #36                 // String parcel.readString()
      55: invokestatic  #38                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      58: aload_0
      59: aload_2
      60: aload_3
      61: aload         4
      63: aload         5
      65: aload_1
      66: invokespecial #41                 // Method "<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      69: return

  public ryey.easer.core.e(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String);
    Code:
       0: aload_1
       1: ldc           #45                 // String packageName
       3: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #47                 // String pluginId
       9: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_3
      13: ldc           #49                 // String pluginName
      15: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      18: aload         5
      20: ldc           #51                 // String category
      22: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      25: aload         5
      27: invokestatic  #57                 // Method ryey/easer/b/a/a.valueOf:(Ljava/lang/String;)Lryey/easer/b/a/a;
      30: astore        5
      32: goto          43
      35: getstatic     #60                 // Field ryey/easer/b/a/a.e:Lryey/easer/b/a/a;
      38: astore        5
      40: goto          32
      43: aload_0
      44: aload_1
      45: aload_2
      46: aload_3
      47: aload         4
      49: aload         5
      51: invokespecial #63                 // Method "<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lryey/easer/b/a/a;)V
      54: return
      55: astore        5
      57: goto          35
    Exception table:
       from    to  target type
          25    32    55   Class java/lang/Exception

  public ryey.easer.core.e(java.lang.String, java.lang.String, java.lang.String, java.lang.String, ryey.easer.b.a.a);
    Code:
       0: aload_1
       1: ldc           #45                 // String packageName
       3: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #47                 // String pluginId
       9: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_3
      13: ldc           #49                 // String pluginName
      15: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      18: aload         5
      20: ldc           #51                 // String category
      22: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      25: aload_0
      26: aload_1
      27: aload_2
      28: aload_3
      29: ldc           #65                 // String ryey.easer.remote_plugin.TYPE.OPERATION
      31: aload         4
      33: invokespecial #66                 // Method ryey/easer/core/g."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      36: aload_0
      37: aload         5
      39: putfield      #68                 // Field a:Lryey/easer/b/a/a;
      42: return

  public final ryey.easer.b.a.a a();
    Code:
       0: aload_0
       1: getfield      #68                 // Field a:Lryey/easer/b/a/a;
       4: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: ldc           #22                 // String parcel
       3: invokestatic  #28                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_1
       7: aload_0
       8: invokevirtual #76                 // Method c:()Ljava/lang/String;
      11: invokevirtual #80                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      14: aload_1
      15: aload_0
      16: invokevirtual #83                 // Method d:()Ljava/lang/String;
      19: invokevirtual #80                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      22: aload_1
      23: aload_0
      24: invokevirtual #85                 // Method e:()Ljava/lang/String;
      27: invokevirtual #80                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      30: aload_1
      31: aload_0
      32: invokevirtual #87                 // Method b:()Ljava/lang/String;
      35: invokevirtual #80                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      38: aload_1
      39: aload_0
      40: getfield      #68                 // Field a:Lryey/easer/b/a/a;
      43: invokevirtual #90                 // Method ryey/easer/b/a/a.toString:()Ljava/lang/String;
      46: invokevirtual #80                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      49: return
}
