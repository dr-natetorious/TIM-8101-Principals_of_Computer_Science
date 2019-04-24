public class ryey.easer.plugins.a.d.a implements ryey.easer.commons.local_plugin.a.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.a.d.a> CREATOR;

  final java.util.List<ryey.easer.plugins.b.b> a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/a/d/a$1
       3: dup
       4: invokespecial #21                 // Method ryey/easer/plugins/a/d/a$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.a.d.a(android.os.Parcel, ryey.easer.plugins.a.d.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #48                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.a.d.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #28                 // class java/util/ArrayList
       8: dup
       9: invokespecial #29                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #31                 // Field a:Ljava/util/List;
      15: getstatic     #54                 // Field ryey/easer/plugins/a/d/a$2.a:[I
      18: aload_2
      19: invokevirtual #60                 // Method ryey/easer/b/a.ordinal:()I
      22: iaload
      23: istore_3
      24: new           #62                 // class org/json/JSONArray
      27: dup
      28: aload_1
      29: invokespecial #65                 // Method org/json/JSONArray."<init>":(Ljava/lang/String;)V
      32: astore_1
      33: aload_1
      34: invokevirtual #68                 // Method org/json/JSONArray.length:()I
      37: anewarray     #70                 // class java/lang/String
      40: astore_2
      41: iconst_0
      42: istore_3
      43: iload_3
      44: aload_1
      45: invokevirtual #68                 // Method org/json/JSONArray.length:()I
      48: if_icmpge     66
      51: aload_2
      52: iload_3
      53: aload_1
      54: iload_3
      55: invokevirtual #74                 // Method org/json/JSONArray.getString:(I)Ljava/lang/String;
      58: aastore
      59: iload_3
      60: iconst_1
      61: iadd
      62: istore_3
      63: goto          43
      66: aload_0
      67: aload_2
      68: invokespecial #77                 // Method a:([Ljava/lang/String;)V
      71: return
      72: astore_1
      73: aload_1
      74: invokestatic  #82                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      77: new           #84                 // class ryey/easer/commons/local_plugin/b
      80: dup
      81: aload_1
      82: invokespecial #87                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      85: athrow
    Exception table:
       from    to  target type
          24    41    72   Class org/json/JSONException
          43    59    72   Class org/json/JSONException
          66    71    72   Class org/json/JSONException

  ryey.easer.plugins.a.d.a(java.lang.String[]);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #28                 // class java/util/ArrayList
       8: dup
       9: invokespecial #29                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #31                 // Field a:Ljava/util/List;
      15: aload_0
      16: aload_1
      17: invokespecial #77                 // Method a:([Ljava/lang/String;)V
      20: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #54                 // Field ryey/easer/plugins/a/d/a$2.a:[I
       3: aload_1
       4: invokevirtual #60                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #62                 // class org/json/JSONArray
      12: dup
      13: invokespecial #105                // Method org/json/JSONArray."<init>":()V
      16: astore_1
      17: aload_0
      18: getfield      #31                 // Field a:Ljava/util/List;
      21: invokeinterface #109,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      26: astore_3
      27: aload_3
      28: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      33: ifeq          56
      36: aload_1
      37: aload_3
      38: invokeinterface #118,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      43: checkcast     #33                 // class ryey/easer/plugins/b/b
      46: invokevirtual #122                // Method ryey/easer/plugins/b/b.toString:()Ljava/lang/String;
      49: invokevirtual #126                // Method org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
      52: pop
      53: goto          27
      56: aload_1
      57: invokevirtual #127                // Method org/json/JSONArray.toString:()Ljava/lang/String;
      60: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #31                 // Field a:Ljava/util/List;
       4: invokeinterface #130,  1          // InterfaceMethod java/util/List.size:()I
       9: ifne          14
      12: iconst_0
      13: ireturn
      14: iconst_1
      15: ireturn

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
      12: instanceof    #2                  // class ryey/easer/plugins/a/d/a
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #31                 // Field a:Ljava/util/List;
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/a/d/a
      28: getfield      #31                 // Field a:Ljava/util/List;
      31: invokeinterface #134,  2          // InterfaceMethod java/util/List.equals:(Ljava/lang/Object;)Z
      36: ifne          41
      39: iconst_0
      40: ireturn
      41: iconst_1
      42: ireturn
      43: iconst_0
      44: ireturn

  public java.lang.String toString();
    Code:
       0: new           #136                // class java/lang/StringBuilder
       3: dup
       4: invokespecial #137                // Method java/lang/StringBuilder."<init>":()V
       7: astore_2
       8: aload_0
       9: getfield      #31                 // Field a:Ljava/util/List;
      12: invokeinterface #130,  1          // InterfaceMethod java/util/List.size:()I
      17: ifle          91
      20: aload_2
      21: aload_0
      22: getfield      #31                 // Field a:Ljava/util/List;
      25: iconst_0
      26: invokeinterface #141,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      31: checkcast     #33                 // class ryey/easer/plugins/b/b
      34: invokevirtual #122                // Method ryey/easer/plugins/b/b.toString:()Ljava/lang/String;
      37: invokevirtual #145                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      40: pop
      41: iconst_1
      42: istore_1
      43: iload_1
      44: aload_0
      45: getfield      #31                 // Field a:Ljava/util/List;
      48: invokeinterface #130,  1          // InterfaceMethod java/util/List.size:()I
      53: if_icmpge     91
      56: aload_2
      57: ldc           #147                // String \n
      59: invokevirtual #145                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      62: pop
      63: aload_2
      64: aload_0
      65: getfield      #31                 // Field a:Ljava/util/List;
      68: iload_1
      69: invokeinterface #141,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      74: checkcast     #33                 // class ryey/easer/plugins/b/b
      77: invokevirtual #122                // Method ryey/easer/plugins/b/b.toString:()Ljava/lang/String;
      80: invokevirtual #145                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      83: pop
      84: iload_1
      85: iconst_1
      86: iadd
      87: istore_1
      88: goto          43
      91: aload_2
      92: invokevirtual #148                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      95: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #31                 // Field a:Ljava/util/List;
       5: invokevirtual #154                // Method android/os/Parcel.writeList:(Ljava/util/List;)V
       8: return
}
