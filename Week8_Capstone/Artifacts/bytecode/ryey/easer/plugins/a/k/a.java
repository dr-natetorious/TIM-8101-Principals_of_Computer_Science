public class ryey.easer.plugins.a.k.a implements ryey.easer.commons.local_plugin.a.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.a.k.a> CREATOR;

  boolean a;

  java.util.Set<java.lang.String> b;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/a/k/a$1
       3: dup
       4: invokespecial #23                 // Method ryey/easer/plugins/a/k/a$1."<init>":()V
       7: putstatic     #25                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.a.k.a(android.os.Parcel, ryey.easer.plugins.a.k.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #57                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.a.k.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #28                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #30                 // Field a:Z
       9: aload_0
      10: new           #32                 // class android/support/v4/g/b
      13: dup
      14: invokespecial #33                 // Method android/support/v4/g/b."<init>":()V
      17: putfield      #35                 // Field b:Ljava/util/Set;
      20: getstatic     #63                 // Field ryey/easer/plugins/a/k/a$2.a:[I
      23: aload_2
      24: invokevirtual #69                 // Method ryey/easer/b/a.ordinal:()I
      27: iaload
      28: istore        4
      30: iload_3
      31: iconst_3
      32: if_icmpge     48
      35: aload_0
      36: new           #71                 // class org/json/JSONArray
      39: dup
      40: aload_1
      41: invokespecial #74                 // Method org/json/JSONArray."<init>":(Ljava/lang/String;)V
      44: invokespecial #77                 // Method a:(Lorg/json/JSONArray;)V
      47: return
      48: new           #79                 // class org/json/JSONObject
      51: dup
      52: aload_1
      53: invokespecial #80                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      56: astore_1
      57: aload_1
      58: ldc           #82                 // String essid
      60: invokevirtual #86                 // Method org/json/JSONObject.has:(Ljava/lang/String;)Z
      63: ifeq          84
      66: aload_0
      67: iconst_1
      68: putfield      #30                 // Field a:Z
      71: aload_1
      72: ldc           #82                 // String essid
      74: invokevirtual #90                 // Method org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
      77: astore_1
      78: aload_0
      79: aload_1
      80: invokespecial #77                 // Method a:(Lorg/json/JSONArray;)V
      83: return
      84: aload_0
      85: iconst_0
      86: putfield      #30                 // Field a:Z
      89: aload_1
      90: ldc           #92                 // String bssid
      92: invokevirtual #90                 // Method org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
      95: astore_1
      96: goto          78
      99: aload_1
     100: invokestatic  #97                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
     103: new           #99                 // class ryey/easer/commons/local_plugin/b
     106: dup
     107: aload_1
     108: invokespecial #102                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
     111: athrow
     112: astore_1
     113: goto          99
    Exception table:
       from    to  target type
          35    47   112   Class org/json/JSONException
          48    78   112   Class org/json/JSONException
          78    83   112   Class org/json/JSONException
          84    96   112   Class org/json/JSONException

  ryey.easer.plugins.a.k.a(java.lang.String, boolean);
    Code:
       0: aload_0
       1: invokespecial #28                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #30                 // Field a:Z
       9: aload_0
      10: new           #32                 // class android/support/v4/g/b
      13: dup
      14: invokespecial #33                 // Method android/support/v4/g/b."<init>":()V
      17: putfield      #35                 // Field b:Ljava/util/Set;
      20: aload_0
      21: iload_2
      22: putfield      #30                 // Field a:Z
      25: aload_0
      26: aload_1
      27: ldc           #105                // String \n
      29: invokevirtual #111                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      32: invokespecial #114                // Method a:([Ljava/lang/String;)V
      35: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #63                 // Field ryey/easer/plugins/a/k/a$2.a:[I
       3: aload_1
       4: invokevirtual #69                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #79                 // class org/json/JSONObject
      12: dup
      13: invokespecial #138                // Method org/json/JSONObject."<init>":()V
      16: astore_3
      17: new           #71                 // class org/json/JSONArray
      20: dup
      21: invokespecial #139                // Method org/json/JSONArray."<init>":()V
      24: astore        4
      26: aload_0
      27: getfield      #35                 // Field b:Ljava/util/Set;
      30: invokeinterface #143,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      35: astore_1
      36: aload_1
      37: invokeinterface #149,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      42: ifeq          63
      45: aload         4
      47: aload_1
      48: invokeinterface #153,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      53: checkcast     #107                // class java/lang/String
      56: invokevirtual #157                // Method org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
      59: pop
      60: goto          36
      63: aload_0
      64: getfield      #30                 // Field a:Z
      67: ifeq          104
      70: ldc           #82                 // String essid
      72: astore_1
      73: aload_3
      74: aload_1
      75: aload         4
      77: invokevirtual #160                // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      80: pop
      81: goto          84
      84: aload_3
      85: invokevirtual #163                // Method org/json/JSONObject.toString:()Ljava/lang/String;
      88: astore_1
      89: aload_1
      90: areturn
      91: astore_1
      92: aload_1
      93: invokestatic  #97                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      96: new           #165                // class java/lang/IllegalStateException
      99: dup
     100: invokespecial #166                // Method java/lang/IllegalStateException."<init>":()V
     103: athrow
     104: ldc           #92                 // String bssid
     106: astore_1
     107: goto          73
    Exception table:
       from    to  target type
           9    36    91   Class org/json/JSONException
          36    60    91   Class org/json/JSONException
          63    70    91   Class org/json/JSONException
          73    81    91   Class org/json/JSONException
          84    89    91   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #35                 // Field b:Ljava/util/Set;
       4: invokeinterface #169,  1          // InterfaceMethod java/util/Set.size:()I
       9: ifne          14
      12: iconst_0
      13: ireturn
      14: iconst_1
      15: ireturn

  boolean a(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #107                // class java/lang/String
       4: ifeq          24
       7: aload_0
       8: getfield      #35                 // Field b:Ljava/util/Set;
      11: aload_1
      12: checkcast     #107                // class java/lang/String
      15: invokevirtual #136                // Method java/lang/String.trim:()Ljava/lang/String;
      18: invokeinterface #172,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
      23: ireturn
      24: aload_0
      25: aload_1
      26: invokevirtual #175                // Method equals:(Ljava/lang/Object;)Z
      29: ireturn

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
       8: ifnull        43
      11: aload_1
      12: instanceof    #2                  // class ryey/easer/plugins/a/k/a
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #35                 // Field b:Ljava/util/Set;
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/a/k/a
      28: getfield      #35                 // Field b:Ljava/util/Set;
      31: invokeinterface #177,  2          // InterfaceMethod java/util/Set.equals:(Ljava/lang/Object;)Z
      36: ifne          41
      39: iconst_0
      40: ireturn
      41: iconst_1
      42: ireturn
      43: iconst_0
      44: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #30                 // Field a:Z
       5: i2b
       6: invokevirtual #183                // Method android/os/Parcel.writeByte:(B)V
       9: aload_1
      10: new           #43                 // class java/util/ArrayList
      13: dup
      14: aload_0
      15: getfield      #35                 // Field b:Ljava/util/Set;
      18: invokespecial #186                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
      21: invokevirtual #189                // Method android/os/Parcel.writeStringList:(Ljava/util/List;)V
      24: return
}
