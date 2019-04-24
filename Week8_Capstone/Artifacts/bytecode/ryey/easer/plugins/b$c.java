public class ryey.easer.plugins.b$c<T extends ryey.easer.commons.local_plugin.d, T_data extends ryey.easer.commons.local_plugin.f> implements ryey.easer.plugins.b$b<T, T_data> {
  final int a;

  final java.util.List<java.lang.Class<? extends T>> b;

  final java.util.List<T> c;

  final java.util.Map<java.lang.String, java.lang.String> d;

  ryey.easer.plugins.b$c(int, ryey.easer.plugins.b$1);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #42                 // Method "<init>":(I)V
       5: return

  ryey.easer.plugins.b$c(int, java.lang.String[][], ryey.easer.plugins.b$1);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokespecial #52                 // Method "<init>":(I[[Ljava/lang/String;)V
       6: return

  public java.util.List<T> a();
    Code:
       0: aload_0
       1: getfield      #31                 // Field c:Ljava/util/List;
       4: areturn

  public java.util.List<T> a(android.content.Context);
    Code:
       0: new           #26                 // class java/util/ArrayList
       3: dup
       4: aload_0
       5: getfield      #31                 // Field c:Ljava/util/List;
       8: invokeinterface #62,  1           // InterfaceMethod java/util/List.size:()I
      13: invokespecial #63                 // Method java/util/ArrayList."<init>":(I)V
      16: astore_2
      17: aload_1
      18: invokestatic  #69                 // Method android/preference/PreferenceManager.getDefaultSharedPreferences:(Landroid/content/Context;)Landroid/content/SharedPreferences;
      21: astore_3
      22: aload_0
      23: getfield      #31                 // Field c:Ljava/util/List;
      26: invokeinterface #73,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      31: astore        4
      33: aload         4
      35: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      40: ifeq          93
      43: aload         4
      45: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      50: checkcast     #85                 // class ryey/easer/commons/local_plugin/d
      53: astore        5
      55: aload_3
      56: aload         5
      58: invokestatic  #90                 // Method ryey/easer/commons/a.a:(Lryey/easer/commons/local_plugin/d;)Ljava/lang/String;
      61: iconst_1
      62: invokeinterface #96,  3           // InterfaceMethod android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
      67: ifeq          33
      70: aload         5
      72: aload_1
      73: invokeinterface #99,  2           // InterfaceMethod ryey/easer/commons/local_plugin/d.a:(Landroid/content/Context;)Z
      78: ifeq          33
      81: aload_2
      82: aload         5
      84: invokeinterface #103,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      89: pop
      90: goto          33
      93: aload_2
      94: areturn

  public T a(ryey.easer.commons.local_plugin.e);
    Code:
       0: aload_0
       1: invokevirtual #107                // Method a:()Ljava/util/List;
       4: invokeinterface #73,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       9: astore_2
      10: aload_2
      11: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          50
      19: aload_2
      20: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: checkcast     #85                 // class ryey/easer/commons/local_plugin/d
      28: astore_3
      29: aload_1
      30: invokevirtual #111                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      33: aload_3
      34: invokeinterface #114,  1          // InterfaceMethod ryey/easer/commons/local_plugin/d.d:()Lryey/easer/commons/local_plugin/e;
      39: invokevirtual #111                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      42: invokevirtual #117                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      45: ifeq          10
      48: aload_3
      49: areturn
      50: aconst_null
      51: areturn

  public T a(T_data);
    Code:
       0: aload_0
       1: invokevirtual #107                // Method a:()Ljava/util/List;
       4: invokeinterface #73,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       9: astore_2
      10: aload_2
      11: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          49
      19: aload_2
      20: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: checkcast     #85                 // class ryey/easer/commons/local_plugin/d
      28: astore_3
      29: aload_1
      30: invokevirtual #111                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      33: aload_3
      34: invokeinterface #122,  1          // InterfaceMethod ryey/easer/commons/local_plugin/d.c:()Lryey/easer/commons/local_plugin/a;
      39: invokeinterface #126,  1          // InterfaceMethod ryey/easer/commons/local_plugin/a.a:()Ljava/lang/Class;
      44: if_acmpne     10
      47: aload_3
      48: areturn
      49: aconst_null
      50: areturn

  void a(java.lang.Class<? extends T>);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #29                 // Field b:Ljava/util/List;
       6: invokeinterface #73,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      11: astore_2
      12: aload_2
      13: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      18: ifeq          39
      21: aload_2
      22: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      27: checkcast     #134                // class java/lang/Class
      30: astore_3
      31: aload_3
      32: aload_1
      33: if_acmpne     12
      36: aload_0
      37: monitorexit
      38: return
      39: aload_0
      40: getfield      #29                 // Field b:Ljava/util/List;
      43: aload_1
      44: invokeinterface #103,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      49: pop
      50: aload_1
      51: invokevirtual #137                // Method java/lang/Class.newInstance:()Ljava/lang/Object;
      54: checkcast     #85                 // class ryey/easer/commons/local_plugin/d
      57: astore_1
      58: aload_0
      59: getfield      #31                 // Field c:Ljava/util/List;
      62: aload_1
      63: invokeinterface #103,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      68: pop
      69: goto          84
      72: astore_1
      73: aload_1
      74: invokestatic  #142                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      77: goto          84
      80: astore_1
      81: goto          73
      84: aload_0
      85: monitorexit
      86: return
      87: astore_1
      88: aload_0
      89: monitorexit
      90: aload_1
      91: athrow
    Exception table:
       from    to  target type
           2    12    87   any
          12    31    87   any
          39    50    87   any
          50    69    80   Class java/lang/InstantiationException
          50    69    72   Class java/lang/IllegalAccessException
          50    69    87   any
          73    77    87   any

  public boolean a(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #147                // Method b:(Ljava/lang/String;)Lryey/easer/commons/local_plugin/d;
       5: ifnonnull     10
       8: iconst_0
       9: ireturn
      10: iconst_1
      11: ireturn

  public T b(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #36                 // Field d:Ljava/util/Map;
       4: invokeinterface #148,  1          // InterfaceMethod java/util/Map.size:()I
       9: ifle          19
      12: aload_0
      13: getfield      #36                 // Field d:Ljava/util/Map;
      16: invokestatic  #153                // Method com/b/a/i.a:(Ljava/lang/Object;)V
      19: aload_1
      20: astore_2
      21: aload_0
      22: getfield      #36                 // Field d:Ljava/util/Map;
      25: aload_1
      26: invokeinterface #156,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      31: ifeq          48
      34: aload_0
      35: getfield      #36                 // Field d:Ljava/util/Map;
      38: aload_1
      39: invokeinterface #160,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      44: checkcast     #162                // class java/lang/String
      47: astore_2
      48: aload_0
      49: invokevirtual #107                // Method a:()Ljava/util/List;
      52: invokeinterface #73,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      57: astore_1
      58: aload_1
      59: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      64: ifeq          92
      67: aload_1
      68: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      73: checkcast     #85                 // class ryey/easer/commons/local_plugin/d
      76: astore_3
      77: aload_2
      78: aload_3
      79: invokeinterface #165,  1          // InterfaceMethod ryey/easer/commons/local_plugin/d.a:()Ljava/lang/String;
      84: invokevirtual #166                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      87: ifeq          58
      90: aload_3
      91: areturn
      92: aconst_null
      93: areturn
}
