public class ryey.easer.core.g implements android.os.Parcelable {
  public static final ryey.easer.core.g$a CREATOR;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/core/g$a
       3: dup
       4: aconst_null
       5: invokespecial #22                 // Method ryey/easer/core/g$a."<init>":(La/b/b/a;)V
       8: putstatic     #24                 // Field CREATOR:Lryey/easer/core/g$a;
      11: return

  public ryey.easer.core.g(android.os.Parcel);
    Code:
       0: aload_1
       1: ldc           #28                 // String parcel
       3: invokestatic  #33                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_1
       7: invokevirtual #39                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      10: astore_2
      11: aload_2
      12: ldc           #41                 // String parcel.readString()
      14: invokestatic  #43                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      17: aload_1
      18: invokevirtual #39                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      21: astore_3
      22: aload_3
      23: ldc           #41                 // String parcel.readString()
      25: invokestatic  #43                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      28: aload_1
      29: invokevirtual #39                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      32: astore        4
      34: aload         4
      36: ldc           #41                 // String parcel.readString()
      38: invokestatic  #43                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      41: aload_1
      42: invokevirtual #39                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      45: astore        5
      47: aload         5
      49: ldc           #41                 // String parcel.readString()
      51: invokestatic  #43                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      54: aload_0
      55: aload_2
      56: aload_3
      57: aload         4
      59: aload         5
      61: aload_1
      62: invokevirtual #39                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      65: invokespecial #46                 // Method "<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      68: return

  public ryey.easer.core.g(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String);
    Code:
       0: aload_1
       1: ldc           #48                 // String packageName
       3: invokestatic  #33                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #50                 // String pluginId
       9: invokestatic  #33                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_3
      13: ldc           #52                 // String pluginName
      15: invokestatic  #33                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      18: aload         4
      20: ldc           #54                 // String pluginType
      22: invokestatic  #33                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      25: aload_0
      26: invokespecial #56                 // Method java/lang/Object."<init>":()V
      29: aload_0
      30: aload_1
      31: putfield      #58                 // Field b:Ljava/lang/String;
      34: aload_0
      35: aload_2
      36: putfield      #60                 // Field c:Ljava/lang/String;
      39: aload_0
      40: aload_3
      41: putfield      #62                 // Field d:Ljava/lang/String;
      44: aload_0
      45: aload         4
      47: putfield      #64                 // Field e:Ljava/lang/String;
      50: aload_0
      51: aload         5
      53: putfield      #66                 // Field a:Ljava/lang/String;
      56: return

  public final java.lang.String b();
    Code:
       0: aload_0
       1: getfield      #66                 // Field a:Ljava/lang/String;
       4: astore_1
       5: aload_1
       6: ifnull        11
       9: aload_1
      10: areturn
      11: new           #68                 // class java/lang/StringBuilder
      14: dup
      15: invokespecial #69                 // Method java/lang/StringBuilder."<init>":()V
      18: astore_1
      19: aload_1
      20: aload_0
      21: getfield      #58                 // Field b:Ljava/lang/String;
      24: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      27: pop
      28: aload_1
      29: ldc           #75                 // String .EditDataActivity
      31: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      34: pop
      35: aload_1
      36: invokevirtual #78                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      39: areturn

  public final java.lang.String c();
    Code:
       0: aload_0
       1: getfield      #58                 // Field b:Ljava/lang/String;
       4: areturn

  public final java.lang.String d();
    Code:
       0: aload_0
       1: getfield      #60                 // Field c:Ljava/lang/String;
       4: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public final java.lang.String e();
    Code:
       0: aload_0
       1: getfield      #62                 // Field d:Ljava/lang/String;
       4: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: ldc           #28                 // String parcel
       3: invokestatic  #33                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_1
       7: aload_0
       8: getfield      #58                 // Field b:Ljava/lang/String;
      11: invokevirtual #86                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      14: aload_1
      15: aload_0
      16: getfield      #60                 // Field c:Ljava/lang/String;
      19: invokevirtual #86                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      22: aload_1
      23: aload_0
      24: getfield      #62                 // Field d:Ljava/lang/String;
      27: invokevirtual #86                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      30: aload_1
      31: aload_0
      32: getfield      #64                 // Field e:Ljava/lang/String;
      35: invokevirtual #86                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      38: aload_1
      39: aload_0
      40: invokevirtual #88                 // Method b:()Ljava/lang/String;
      43: invokevirtual #86                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      46: return
}
