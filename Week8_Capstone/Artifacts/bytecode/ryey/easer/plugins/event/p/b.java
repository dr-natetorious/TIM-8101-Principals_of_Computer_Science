public class ryey.easer.plugins.event.p.b extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.p.b> CREATOR;

  boolean a;

  java.util.Set<java.lang.String> b;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/p/b$1
       3: dup
       4: invokespecial #21                 // Method ryey/easer/plugins/event/p/b$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.p.b(android.os.Parcel, ryey.easer.plugins.event.p.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #55                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.p.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #28                 // Field a:Z
       9: aload_0
      10: new           #30                 // class android/support/v4/g/b
      13: dup
      14: invokespecial #31                 // Method android/support/v4/g/b."<init>":()V
      17: putfield      #33                 // Field b:Ljava/util/Set;
      20: aload_0
      21: aload_1
      22: aload_2
      23: iload_3
      24: invokevirtual #58                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      27: return

  ryey.easer.plugins.event.p.b(java.lang.String, boolean);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #28                 // Field a:Z
       9: aload_0
      10: new           #30                 // class android/support/v4/g/b
      13: dup
      14: invokespecial #31                 // Method android/support/v4/g/b."<init>":()V
      17: putfield      #33                 // Field b:Ljava/util/Set;
      20: aload_0
      21: iload_2
      22: putfield      #28                 // Field a:Z
      25: aload_0
      26: aload_1
      27: ldc           #61                 // String \n
      29: invokevirtual #67                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      32: invokespecial #70                 // Method a:([Ljava/lang/String;)V
      35: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #103                // Field ryey/easer/plugins/event/p/b$2.a:[I
       3: aload_1
       4: invokevirtual #108                // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #110                // class org/json/JSONObject
      12: dup
      13: invokespecial #111                // Method org/json/JSONObject."<init>":()V
      16: astore_3
      17: new           #73                 // class org/json/JSONArray
      20: dup
      21: invokespecial #112                // Method org/json/JSONArray."<init>":()V
      24: astore        4
      26: aload_0
      27: getfield      #33                 // Field b:Ljava/util/Set;
      30: invokeinterface #116,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      35: astore_1
      36: aload_1
      37: invokeinterface #122,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      42: ifeq          63
      45: aload         4
      47: aload_1
      48: invokeinterface #126,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      53: checkcast     #63                 // class java/lang/String
      56: invokevirtual #130                // Method org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
      59: pop
      60: goto          36
      63: aload_0
      64: getfield      #28                 // Field a:Z
      67: ifeq          104
      70: ldc           #132                // String essid
      72: astore_1
      73: aload_3
      74: aload_1
      75: aload         4
      77: invokevirtual #135                // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      80: pop
      81: goto          84
      84: aload_3
      85: invokevirtual #138                // Method org/json/JSONObject.toString:()Ljava/lang/String;
      88: astore_1
      89: aload_1
      90: areturn
      91: astore_1
      92: aload_1
      93: invokestatic  #143                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      96: new           #145                // class java/lang/IllegalStateException
      99: dup
     100: invokespecial #146                // Method java/lang/IllegalStateException."<init>":()V
     103: athrow
     104: ldc           #148                // String bssid
     106: astore_1
     107: goto          73
    Exception table:
       from    to  target type
           9    36    91   Class org/json/JSONException
          36    60    91   Class org/json/JSONException
          63    70    91   Class org/json/JSONException
          73    81    91   Class org/json/JSONException
          84    89    91   Class org/json/JSONException

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Ljava/util/Set;
       4: invokeinterface #88,  1           // InterfaceMethod java/util/Set.clear:()V
       9: getstatic     #103                // Field ryey/easer/plugins/event/p/b$2.a:[I
      12: aload_2
      13: invokevirtual #108                // Method ryey/easer/b/a.ordinal:()I
      16: iaload
      17: istore        4
      19: iload_3
      20: iconst_3
      21: if_icmpge     37
      24: aload_0
      25: new           #73                 // class org/json/JSONArray
      28: dup
      29: aload_1
      30: invokespecial #151                // Method org/json/JSONArray."<init>":(Ljava/lang/String;)V
      33: invokespecial #153                // Method a:(Lorg/json/JSONArray;)V
      36: return
      37: new           #110                // class org/json/JSONObject
      40: dup
      41: aload_1
      42: invokespecial #154                // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      45: astore_1
      46: aload_1
      47: ldc           #132                // String essid
      49: invokevirtual #157                // Method org/json/JSONObject.has:(Ljava/lang/String;)Z
      52: ifeq          73
      55: aload_0
      56: iconst_1
      57: putfield      #28                 // Field a:Z
      60: aload_1
      61: ldc           #132                // String essid
      63: invokevirtual #161                // Method org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
      66: astore_1
      67: aload_0
      68: aload_1
      69: invokespecial #153                // Method a:(Lorg/json/JSONArray;)V
      72: return
      73: aload_0
      74: iconst_0
      75: putfield      #28                 // Field a:Z
      78: aload_1
      79: ldc           #148                // String bssid
      81: invokevirtual #161                // Method org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
      84: astore_1
      85: goto          67
      88: aload_1
      89: invokestatic  #143                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      92: new           #163                // class ryey/easer/commons/local_plugin/b
      95: dup
      96: aload_1
      97: invokespecial #166                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
     100: athrow
     101: astore_1
     102: goto          88
    Exception table:
       from    to  target type
          24    36   101   Class org/json/JSONException
          37    67   101   Class org/json/JSONException
          67    72   101   Class org/json/JSONException
          73    85   101   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Ljava/util/Set;
       4: invokeinterface #169,  1          // InterfaceMethod java/util/Set.size:()I
       9: ifne          14
      12: iconst_0
      13: ireturn
      14: iconst_1
      15: ireturn

  public boolean a(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #63                 // class java/lang/String
       4: ifeq          24
       7: aload_0
       8: getfield      #33                 // Field b:Ljava/util/Set;
      11: aload_1
      12: checkcast     #63                 // class java/lang/String
      15: invokevirtual #97                 // Method java/lang/String.trim:()Ljava/lang/String;
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

  public ryey.easer.commons.local_plugin.b.a[] dynamics();
    Code:
       0: aconst_null
       1: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        53
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/plugins/event/p/b
       8: ifne          13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: getfield      #28                 // Field a:Z
      17: istore_2
      18: aload_1
      19: checkcast     #2                  // class ryey/easer/plugins/event/p/b
      22: astore_1
      23: iload_2
      24: aload_1
      25: getfield      #28                 // Field a:Z
      28: if_icmpeq     33
      31: iconst_0
      32: ireturn
      33: aload_0
      34: getfield      #33                 // Field b:Ljava/util/Set;
      37: aload_1
      38: getfield      #33                 // Field b:Ljava/util/Set;
      41: invokeinterface #179,  2          // InterfaceMethod java/util/Set.equals:(Ljava/lang/Object;)Z
      46: ifne          51
      49: iconst_0
      50: ireturn
      51: iconst_1
      52: ireturn
      53: iconst_0
      54: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #28                 // Field a:Z
       5: i2b
       6: invokevirtual #185                // Method android/os/Parcel.writeByte:(B)V
       9: aload_1
      10: new           #41                 // class java/util/ArrayList
      13: dup
      14: aload_0
      15: getfield      #33                 // Field b:Ljava/util/Set;
      18: invokespecial #188                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
      21: invokevirtual #191                // Method android/os/Parcel.writeStringList:(Ljava/util/List;)V
      24: return
}
