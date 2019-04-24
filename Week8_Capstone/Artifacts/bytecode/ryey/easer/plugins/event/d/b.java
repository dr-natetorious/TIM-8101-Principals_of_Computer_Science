public class ryey.easer.plugins.event.d.b extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.d.b> CREATOR;

  ryey.easer.plugins.event.d.a a;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/d/b$1
       3: dup
       4: invokespecial #18                 // Method ryey/easer/plugins/event/d/b$1."<init>":()V
       7: putstatic     #20                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.d.b(android.os.Parcel, ryey.easer.plugins.event.d.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #57                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.d.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #60                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  ryey.easer.plugins.event.d.b(ryey.easer.plugins.event.d.a);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
       9: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #67                 // Field ryey/easer/plugins/event/d/b$2.a:[I
       3: aload_1
       4: invokevirtual #73                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #75                 // class org/json/JSONObject
      12: dup
      13: invokespecial #76                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #78                 // String calendar_id
      20: aload_0
      21: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      24: getfield      #38                 // Field ryey/easer/plugins/event/d/a.b:J
      27: invokevirtual #82                 // Method org/json/JSONObject.put:(Ljava/lang/String;J)Lorg/json/JSONObject;
      30: pop
      31: new           #84                 // class org/json/JSONArray
      34: dup
      35: invokespecial #85                 // Method org/json/JSONArray."<init>":()V
      38: astore_3
      39: aload_0
      40: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      43: getfield      #54                 // Field ryey/easer/plugins/event/d/a.c:Ljava/util/Set;
      46: invokeinterface #91,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      51: astore        4
      53: aload         4
      55: invokeinterface #97,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      60: ifeq          81
      63: aload_3
      64: aload         4
      66: invokeinterface #101,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      71: checkcast     #103                // class java/lang/String
      74: invokevirtual #106                // Method org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
      77: pop
      78: goto          53
      81: aload_1
      82: ldc           #108                // String condition
      84: aload_3
      85: invokevirtual #111                // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      88: pop
      89: goto          117
      92: astore_3
      93: aload_3
      94: ldc           #113                // String Error putting %s data
      96: iconst_1
      97: anewarray     #115                // class java/lang/Object
     100: dup
     101: iconst_0
     102: aload_0
     103: invokevirtual #119                // Method java/lang/Object.getClass:()Ljava/lang/Class;
     106: invokevirtual #125                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
     109: aastore
     110: invokestatic  #130                // Method com/b/a/i.a:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
     113: aload_3
     114: invokestatic  #135                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
     117: aload_1
     118: invokevirtual #138                // Method org/json/JSONObject.toString:()Ljava/lang/String;
     121: areturn
    Exception table:
       from    to  target type
          17    53    92   Class org/json/JSONException
          53    78    92   Class org/json/JSONException
          81    89    92   Class org/json/JSONException

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #67                 // Field ryey/easer/plugins/event/d/b$2.a:[I
       3: aload_2
       4: invokevirtual #73                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: new           #75                 // class org/json/JSONObject
      12: dup
      13: aload_1
      14: invokespecial #141                // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      17: astore_1
      18: aload_0
      19: new           #25                 // class ryey/easer/plugins/event/d/a
      22: dup
      23: invokespecial #26                 // Method ryey/easer/plugins/event/d/a."<init>":()V
      26: putfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      29: aload_0
      30: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      33: aload_1
      34: ldc           #78                 // String calendar_id
      36: invokevirtual #145                // Method org/json/JSONObject.optLong:(Ljava/lang/String;)J
      39: putfield      #38                 // Field ryey/easer/plugins/event/d/a.b:J
      42: aload_1
      43: ldc           #108                // String condition
      45: invokevirtual #149                // Method org/json/JSONObject.optJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
      48: astore_1
      49: iconst_0
      50: istore_3
      51: iload_3
      52: aload_1
      53: invokevirtual #152                // Method org/json/JSONArray.length:()I
      56: if_icmpge     132
      59: aload_1
      60: iload_3
      61: invokevirtual #156                // Method org/json/JSONArray.getString:(I)Ljava/lang/String;
      64: astore_2
      65: iconst_0
      66: istore        4
      68: iload         4
      70: getstatic     #159                // Field ryey/easer/plugins/event/d/a.a:[Ljava/lang/String;
      73: arraylength
      74: if_icmpge     100
      77: aload_0
      78: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      81: getfield      #54                 // Field ryey/easer/plugins/event/d/a.c:Ljava/util/Set;
      84: aload_2
      85: invokeinterface #163,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      90: pop
      91: iload         4
      93: iconst_1
      94: iadd
      95: istore        4
      97: goto          68
     100: iload_3
     101: iconst_1
     102: iadd
     103: istore_3
     104: goto          51
     107: astore_1
     108: aload_1
     109: ldc           #165                // String Error parsing %s data to SUFFIX
     111: iconst_1
     112: anewarray     #115                // class java/lang/Object
     115: dup
     116: iconst_0
     117: aload_0
     118: invokevirtual #119                // Method java/lang/Object.getClass:()Ljava/lang/Class;
     121: invokevirtual #125                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
     124: aastore
     125: invokestatic  #130                // Method com/b/a/i.a:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
     128: aload_1
     129: invokestatic  #135                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
     132: return
    Exception table:
       from    to  target type
           9    49   107   Class org/json/JSONException
          51    65   107   Class org/json/JSONException
          68    91   107   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      13: getfield      #38                 // Field ryey/easer/plugins/event/d/a.b:J
      16: ldc2_w        #166                // long -1l
      19: lcmp
      20: ifne          25
      23: iconst_0
      24: ireturn
      25: aload_0
      26: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      29: getfield      #54                 // Field ryey/easer/plugins/event/d/a.c:Ljava/util/Set;
      32: invokeinterface #170,  1          // InterfaceMethod java/util/Set.size:()I
      37: ifne          42
      40: iconst_0
      41: ireturn
      42: iconst_1
      43: ireturn

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
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #2                  // class ryey/easer/plugins/event/d/b
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      20: getfield      #38                 // Field ryey/easer/plugins/event/d/a.b:J
      23: lstore_2
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/event/d/b
      28: astore_1
      29: lload_2
      30: aload_1
      31: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      34: getfield      #38                 // Field ryey/easer/plugins/event/d/a.b:J
      37: lcmp
      38: ifeq          43
      41: iconst_0
      42: ireturn
      43: aload_0
      44: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      47: getfield      #54                 // Field ryey/easer/plugins/event/d/a.c:Ljava/util/Set;
      50: aload_1
      51: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      54: getfield      #54                 // Field ryey/easer/plugins/event/d/a.c:Ljava/util/Set;
      57: invokeinterface #176,  2          // InterfaceMethod java/util/Set.equals:(Ljava/lang/Object;)Z
      62: ifne          67
      65: iconst_0
      66: ireturn
      67: iconst_1
      68: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
       5: getfield      #38                 // Field ryey/easer/plugins/event/d/a.b:J
       8: invokevirtual #182                // Method android/os/Parcel.writeLong:(J)V
      11: aload_1
      12: new           #40                 // class java/util/ArrayList
      15: dup
      16: aload_0
      17: getfield      #28                 // Field a:Lryey/easer/plugins/event/d/a;
      20: getfield      #54                 // Field ryey/easer/plugins/event/d/a.c:Ljava/util/Set;
      23: invokespecial #183                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
      26: invokevirtual #187                // Method android/os/Parcel.writeList:(Ljava/util/List;)V
      29: return
}
