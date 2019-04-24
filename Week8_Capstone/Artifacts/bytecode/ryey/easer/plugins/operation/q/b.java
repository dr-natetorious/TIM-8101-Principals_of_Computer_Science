public class ryey.easer.plugins.operation.q.b implements ryey.easer.commons.local_plugin.c.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.q.b> CREATOR;

  java.lang.Integer a;

  java.lang.Integer b;

  java.lang.Integer c;

  java.lang.Integer d;

  java.lang.Integer e;

  java.lang.Integer f;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/operation/q/b$1
       3: dup
       4: invokespecial #25                 // Method ryey/easer/plugins/operation/q/b$1."<init>":()V
       7: putstatic     #27                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.q.b(android.os.Parcel, ryey.easer.plugins.operation.q.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #59                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.q.b(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer);
    Code:
       0: aload_0
       1: invokespecial #30                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #46                 // Field a:Ljava/lang/Integer;
       9: aload_0
      10: aload_2
      11: putfield      #48                 // Field b:Ljava/lang/Integer;
      14: aload_0
      15: aload_3
      16: putfield      #50                 // Field c:Ljava/lang/Integer;
      19: aload_0
      20: aload         4
      22: putfield      #52                 // Field d:Ljava/lang/Integer;
      25: aload_0
      26: aload         5
      28: putfield      #54                 // Field e:Ljava/lang/Integer;
      31: aload_0
      32: aload         6
      34: putfield      #56                 // Field f:Ljava/lang/Integer;
      37: return

  ryey.easer.plugins.operation.q.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #30                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #63                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #90                 // Field ryey/easer/plugins/operation/q/b$2.a:[I
       3: aload_1
       4: invokevirtual #95                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #66                 // class org/json/JSONObject
      12: dup
      13: invokespecial #96                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: aload_0
      19: getfield      #46                 // Field a:Ljava/lang/Integer;
      22: ldc           #98                 // String ring
      24: invokestatic  #100                // Method a:(Lorg/json/JSONObject;Ljava/lang/Integer;Ljava/lang/String;)V
      27: aload_1
      28: aload_0
      29: getfield      #48                 // Field b:Ljava/lang/Integer;
      32: ldc           #102                // String media
      34: invokestatic  #100                // Method a:(Lorg/json/JSONObject;Ljava/lang/Integer;Ljava/lang/String;)V
      37: aload_1
      38: aload_0
      39: getfield      #50                 // Field c:Ljava/lang/Integer;
      42: ldc           #104                // String alarm
      44: invokestatic  #100                // Method a:(Lorg/json/JSONObject;Ljava/lang/Integer;Ljava/lang/String;)V
      47: aload_1
      48: aload_0
      49: getfield      #52                 // Field d:Ljava/lang/Integer;
      52: ldc           #106                // String notification
      54: invokestatic  #100                // Method a:(Lorg/json/JSONObject;Ljava/lang/Integer;Ljava/lang/String;)V
      57: aload_1
      58: aload_0
      59: getfield      #54                 // Field e:Ljava/lang/Integer;
      62: ldc           #108                // String bluetooth
      64: invokestatic  #100                // Method a:(Lorg/json/JSONObject;Ljava/lang/Integer;Ljava/lang/String;)V
      67: aload_1
      68: aload_0
      69: getfield      #56                 // Field f:Ljava/lang/Integer;
      72: ldc           #110                // String bluetooth_delay
      74: invokestatic  #100                // Method a:(Lorg/json/JSONObject;Ljava/lang/Integer;Ljava/lang/String;)V
      77: aload_1
      78: invokevirtual #114                // Method org/json/JSONObject.toString:()Ljava/lang/String;
      81: astore_1
      82: aload_1
      83: areturn
      84: astore_1
      85: new           #116                // class java/lang/IllegalStateException
      88: dup
      89: aload_1
      90: invokespecial #119                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
      93: athrow
    Exception table:
       from    to  target type
          17    82    84   Class org/json/JSONException

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #90                 // Field ryey/easer/plugins/operation/q/b$2.a:[I
       3: aload_2
       4: invokevirtual #95                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: new           #66                 // class org/json/JSONObject
      12: dup
      13: aload_1
      14: invokespecial #123                // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      17: astore_1
      18: aload_0
      19: aload_1
      20: ldc           #98                 // String ring
      22: invokestatic  #125                // Method a:(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
      25: putfield      #46                 // Field a:Ljava/lang/Integer;
      28: aload_0
      29: aload_1
      30: ldc           #102                // String media
      32: invokestatic  #125                // Method a:(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
      35: putfield      #48                 // Field b:Ljava/lang/Integer;
      38: aload_0
      39: aload_1
      40: ldc           #104                // String alarm
      42: invokestatic  #125                // Method a:(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
      45: putfield      #50                 // Field c:Ljava/lang/Integer;
      48: aload_0
      49: aload_1
      50: ldc           #106                // String notification
      52: invokestatic  #125                // Method a:(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
      55: putfield      #52                 // Field d:Ljava/lang/Integer;
      58: aload_0
      59: aload_1
      60: ldc           #108                // String bluetooth
      62: invokestatic  #125                // Method a:(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
      65: putfield      #54                 // Field e:Ljava/lang/Integer;
      68: aload_0
      69: aload_1
      70: ldc           #110                // String bluetooth_delay
      72: invokestatic  #125                // Method a:(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
      75: putfield      #56                 // Field f:Ljava/lang/Integer;
      78: return
      79: astore_1
      80: new           #127                // class ryey/easer/commons/local_plugin/b
      83: dup
      84: aload_1
      85: invokespecial #130                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      88: athrow
    Exception table:
       from    to  target type
           9    78    79   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Ljava/lang/Integer;
       4: invokestatic  #133                // Method a:(Ljava/lang/Integer;)Z
       7: istore_3
       8: iconst_0
       9: istore        4
      11: iload_3
      12: ifne          68
      15: aload_0
      16: getfield      #48                 // Field b:Ljava/lang/Integer;
      19: invokestatic  #133                // Method a:(Ljava/lang/Integer;)Z
      22: ifne          68
      25: aload_0
      26: getfield      #50                 // Field c:Ljava/lang/Integer;
      29: invokestatic  #133                // Method a:(Ljava/lang/Integer;)Z
      32: ifne          68
      35: aload_0
      36: getfield      #52                 // Field d:Ljava/lang/Integer;
      39: invokestatic  #133                // Method a:(Ljava/lang/Integer;)Z
      42: ifne          68
      45: aload_0
      46: getfield      #54                 // Field e:Ljava/lang/Integer;
      49: invokestatic  #133                // Method a:(Ljava/lang/Integer;)Z
      52: ifne          68
      55: iload         4
      57: istore_3
      58: aload_0
      59: getfield      #56                 // Field f:Ljava/lang/Integer;
      62: invokestatic  #133                // Method a:(Ljava/lang/Integer;)Z
      65: ifeq          106
      68: aload_0
      69: getfield      #54                 // Field e:Ljava/lang/Integer;
      72: ifnonnull     80
      75: iconst_1
      76: istore_1
      77: goto          82
      80: iconst_0
      81: istore_1
      82: aload_0
      83: getfield      #56                 // Field f:Ljava/lang/Integer;
      86: ifnonnull     94
      89: iconst_1
      90: istore_2
      91: goto          96
      94: iconst_0
      95: istore_2
      96: iload         4
      98: istore_3
      99: iload_1
     100: iload_2
     101: if_icmpne     106
     104: iconst_1
     105: istore_3
     106: iload_3
     107: ireturn

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
       8: ifnull        125
      11: aload_1
      12: instanceof    #2                  // class ryey/easer/plugins/operation/q/b
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #46                 // Field a:Ljava/lang/Integer;
      24: astore_2
      25: aload_1
      26: checkcast     #2                  // class ryey/easer/plugins/operation/q/b
      29: astore_1
      30: aload_2
      31: aload_1
      32: getfield      #46                 // Field a:Ljava/lang/Integer;
      35: invokestatic  #144                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      38: ifne          43
      41: iconst_0
      42: ireturn
      43: aload_0
      44: getfield      #48                 // Field b:Ljava/lang/Integer;
      47: aload_1
      48: getfield      #48                 // Field b:Ljava/lang/Integer;
      51: invokestatic  #144                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      54: ifne          59
      57: iconst_0
      58: ireturn
      59: aload_0
      60: getfield      #50                 // Field c:Ljava/lang/Integer;
      63: aload_1
      64: getfield      #50                 // Field c:Ljava/lang/Integer;
      67: invokestatic  #144                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      70: ifne          75
      73: iconst_0
      74: ireturn
      75: aload_0
      76: getfield      #52                 // Field d:Ljava/lang/Integer;
      79: aload_1
      80: getfield      #52                 // Field d:Ljava/lang/Integer;
      83: invokestatic  #144                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      86: ifne          91
      89: iconst_0
      90: ireturn
      91: aload_0
      92: getfield      #54                 // Field e:Ljava/lang/Integer;
      95: aload_1
      96: getfield      #54                 // Field e:Ljava/lang/Integer;
      99: invokestatic  #144                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
     102: ifne          107
     105: iconst_0
     106: ireturn
     107: aload_0
     108: getfield      #56                 // Field f:Ljava/lang/Integer;
     111: aload_1
     112: getfield      #56                 // Field f:Ljava/lang/Integer;
     115: invokestatic  #144                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
     118: ifne          123
     121: iconst_0
     122: ireturn
     123: iconst_1
     124: ireturn
     125: iconst_0
     126: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #46                 // Field a:Ljava/lang/Integer;
       5: invokevirtual #150                // Method android/os/Parcel.writeValue:(Ljava/lang/Object;)V
       8: aload_1
       9: aload_0
      10: getfield      #48                 // Field b:Ljava/lang/Integer;
      13: invokevirtual #150                // Method android/os/Parcel.writeValue:(Ljava/lang/Object;)V
      16: aload_1
      17: aload_0
      18: getfield      #50                 // Field c:Ljava/lang/Integer;
      21: invokevirtual #150                // Method android/os/Parcel.writeValue:(Ljava/lang/Object;)V
      24: aload_1
      25: aload_0
      26: getfield      #52                 // Field d:Ljava/lang/Integer;
      29: invokevirtual #150                // Method android/os/Parcel.writeValue:(Ljava/lang/Object;)V
      32: aload_1
      33: aload_0
      34: getfield      #54                 // Field e:Ljava/lang/Integer;
      37: invokevirtual #150                // Method android/os/Parcel.writeValue:(Ljava/lang/Object;)V
      40: aload_1
      41: aload_0
      42: getfield      #56                 // Field f:Ljava/lang/Integer;
      45: invokevirtual #150                // Method android/os/Parcel.writeValue:(Ljava/lang/Object;)V
      48: return
}
