public class ryey.easer.plugins.operation.i.b implements ryey.easer.commons.local_plugin.c.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.i.b> CREATOR;

  ryey.easer.plugins.operation.i.b$a a;

  java.lang.String b;

  int c;

  java.lang.String d;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/operation/i/b$1
       3: dup
       4: invokespecial #27                 // Method ryey/easer/plugins/operation/i/b$1."<init>":()V
       7: putstatic     #29                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.i.b(android.os.Parcel, ryey.easer.plugins.operation.i.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #57                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.i.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #32                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #60                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  ryey.easer.plugins.operation.i.b(ryey.easer.plugins.operation.i.b$a, java.lang.String, int, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #32                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #40                 // Field a:Lryey/easer/plugins/operation/i/b$a;
       9: aload_0
      10: aload_2
      11: putfield      #46                 // Field b:Ljava/lang/String;
      14: aload_0
      15: iload_3
      16: putfield      #52                 // Field c:I
      19: aload_0
      20: aload         4
      22: putfield      #54                 // Field d:Ljava/lang/String;
      25: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #67                 // Field ryey/easer/plugins/operation/i/b$2.a:[I
       3: aload_1
       4: invokevirtual #72                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #74                 // class org/json/JSONObject
      12: dup
      13: invokespecial #75                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #77                 // String protocol
      20: aload_0
      21: getfield      #40                 // Field a:Lryey/easer/plugins/operation/i/b$a;
      24: invokevirtual #80                 // Method ryey/easer/plugins/operation/i/b$a.toString:()Ljava/lang/String;
      27: invokevirtual #84                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      30: pop
      31: aload_1
      32: ldc           #86                 // String remote_address
      34: aload_0
      35: getfield      #46                 // Field b:Ljava/lang/String;
      38: invokevirtual #84                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      41: pop
      42: aload_1
      43: ldc           #88                 // String remote_port
      45: aload_0
      46: getfield      #52                 // Field c:I
      49: invokevirtual #91                 // Method org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
      52: pop
      53: aload_1
      54: ldc           #93                 // String data
      56: aload_0
      57: getfield      #54                 // Field d:Ljava/lang/String;
      60: invokevirtual #84                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      63: pop
      64: aload_1
      65: invokevirtual #94                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      68: astore_1
      69: aload_1
      70: areturn
      71: astore_1
      72: aload_1
      73: invokestatic  #99                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      76: new           #101                // class java/lang/IllegalStateException
      79: dup
      80: aload_1
      81: invokevirtual #104                // Method org/json/JSONException.getMessage:()Ljava/lang/String;
      84: invokespecial #107                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      87: athrow
    Exception table:
       from    to  target type
          17    69    71   Class org/json/JSONException

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #67                 // Field ryey/easer/plugins/operation/i/b$2.a:[I
       3: aload_2
       4: invokevirtual #72                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: new           #74                 // class org/json/JSONObject
      12: dup
      13: aload_1
      14: invokespecial #109                // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      17: astore_1
      18: aload_0
      19: aload_1
      20: ldc           #77                 // String protocol
      22: invokevirtual #113                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      25: invokestatic  #117                // Method ryey/easer/plugins/operation/i/b$a.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/operation/i/b$a;
      28: putfield      #40                 // Field a:Lryey/easer/plugins/operation/i/b$a;
      31: aload_0
      32: aload_1
      33: ldc           #86                 // String remote_address
      35: invokevirtual #113                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      38: putfield      #46                 // Field b:Ljava/lang/String;
      41: aload_0
      42: aload_1
      43: ldc           #88                 // String remote_port
      45: invokevirtual #121                // Method org/json/JSONObject.getInt:(Ljava/lang/String;)I
      48: putfield      #52                 // Field c:I
      51: aload_0
      52: aload_1
      53: ldc           #93                 // String data
      55: invokevirtual #113                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      58: putfield      #54                 // Field d:Ljava/lang/String;
      61: return
      62: astore_1
      63: aload_1
      64: invokestatic  #99                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      67: new           #123                // class ryey/easer/commons/local_plugin/b
      70: dup
      71: aload_1
      72: invokespecial #126                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      75: athrow
    Exception table:
       from    to  target type
           9    61    62   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #40                 // Field a:Lryey/easer/plugins/operation/i/b$a;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #46                 // Field b:Ljava/lang/String;
      13: invokestatic  #132                // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      16: ifeq          21
      19: iconst_0
      20: ireturn
      21: aload_0
      22: getfield      #52                 // Field c:I
      25: ifgt          30
      28: iconst_0
      29: ireturn
      30: iconst_1
      31: ireturn

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
       8: instanceof    #2                  // class ryey/easer/plugins/operation/i/b
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #40                 // Field a:Lryey/easer/plugins/operation/i/b$a;
      20: astore_2
      21: aload_1
      22: checkcast     #2                  // class ryey/easer/plugins/operation/i/b
      25: astore_1
      26: aload_2
      27: aload_1
      28: getfield      #40                 // Field a:Lryey/easer/plugins/operation/i/b$a;
      31: if_acmpeq     36
      34: iconst_0
      35: ireturn
      36: aload_0
      37: getfield      #46                 // Field b:Ljava/lang/String;
      40: aload_1
      41: getfield      #46                 // Field b:Ljava/lang/String;
      44: invokevirtual #142                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      47: ifne          52
      50: iconst_0
      51: ireturn
      52: aload_0
      53: getfield      #52                 // Field c:I
      56: aload_1
      57: getfield      #52                 // Field c:I
      60: if_icmpeq     65
      63: iconst_0
      64: ireturn
      65: aload_0
      66: getfield      #54                 // Field d:Ljava/lang/String;
      69: aload_1
      70: getfield      #54                 // Field d:Ljava/lang/String;
      73: invokestatic  #145                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      76: ifne          81
      79: iconst_0
      80: ireturn
      81: iconst_1
      82: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #40                 // Field a:Lryey/easer/plugins/operation/i/b$a;
       5: invokevirtual #151                // Method android/os/Parcel.writeSerializable:(Ljava/io/Serializable;)V
       8: aload_1
       9: aload_0
      10: getfield      #46                 // Field b:Ljava/lang/String;
      13: invokevirtual #154                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      16: aload_1
      17: aload_0
      18: getfield      #52                 // Field c:I
      21: invokevirtual #158                // Method android/os/Parcel.writeInt:(I)V
      24: aload_1
      25: aload_0
      26: getfield      #54                 // Field d:Ljava/lang/String;
      29: invokevirtual #154                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      32: return
}
