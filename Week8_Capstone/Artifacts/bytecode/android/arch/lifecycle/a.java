class android.arch.lifecycle.a {
  static android.arch.lifecycle.a a;

  static {};
    Code:
       0: new           #2                  // class android/arch/lifecycle/a
       3: dup
       4: invokespecial #20                 // Method "<init>":()V
       7: putstatic     #22                 // Field a:Landroid/arch/lifecycle/a;
      10: return

  android.arch.lifecycle.a();
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #26                 // class java/util/HashMap
       8: dup
       9: invokespecial #27                 // Method java/util/HashMap."<init>":()V
      12: putfield      #29                 // Field b:Ljava/util/Map;
      15: aload_0
      16: new           #26                 // class java/util/HashMap
      19: dup
      20: invokespecial #27                 // Method java/util/HashMap."<init>":()V
      23: putfield      #31                 // Field c:Ljava/util/Map;
      26: return

  boolean a(java.lang.Class);
    Code:
       0: aload_0
       1: getfield      #31                 // Field c:Ljava/util/Map;
       4: aload_1
       5: invokeinterface #192,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      10: ifeq          30
      13: aload_0
      14: getfield      #31                 // Field c:Ljava/util/Map;
      17: aload_1
      18: invokeinterface #144,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      23: checkcast     #136                // class java/lang/Boolean
      26: invokevirtual #195                // Method java/lang/Boolean.booleanValue:()Z
      29: ireturn
      30: aload_0
      31: aload_1
      32: invokespecial #88                 // Method c:(Ljava/lang/Class;)[Ljava/lang/reflect/Method;
      35: astore        4
      37: aload         4
      39: arraylength
      40: istore_3
      41: iconst_0
      42: istore_2
      43: iload_2
      44: iload_3
      45: if_icmpge     80
      48: aload         4
      50: iload_2
      51: aaload
      52: ldc           #90                 // class android/arch/lifecycle/l
      54: invokevirtual #96                 // Method java/lang/reflect/Method.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      57: checkcast     #90                 // class android/arch/lifecycle/l
      60: ifnull        73
      63: aload_0
      64: aload_1
      65: aload         4
      67: invokespecial #197                // Method a:(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Landroid/arch/lifecycle/a$a;
      70: pop
      71: iconst_1
      72: ireturn
      73: iload_2
      74: iconst_1
      75: iadd
      76: istore_2
      77: goto          43
      80: aload_0
      81: getfield      #31                 // Field c:Ljava/util/Map;
      84: aload_1
      85: iconst_0
      86: invokestatic  #140                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      89: invokeinterface #134,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      94: pop
      95: iconst_0
      96: ireturn

  android.arch.lifecycle.a$a b(java.lang.Class);
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Ljava/util/Map;
       4: aload_1
       5: invokeinterface #144,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      10: checkcast     #6                  // class android/arch/lifecycle/a$a
      13: astore_2
      14: aload_2
      15: ifnull        20
      18: aload_2
      19: areturn
      20: aload_0
      21: aload_1
      22: aconst_null
      23: invokespecial #197                // Method a:(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Landroid/arch/lifecycle/a$a;
      26: areturn
}
