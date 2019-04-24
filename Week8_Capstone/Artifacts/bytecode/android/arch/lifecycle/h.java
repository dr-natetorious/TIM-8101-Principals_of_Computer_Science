public class android.arch.lifecycle.h {
  static {};
    Code:
       0: new           #13                 // class java/util/HashMap
       3: dup
       4: invokespecial #16                 // Method java/util/HashMap."<init>":()V
       7: putstatic     #18                 // Field a:Ljava/util/Map;
      10: new           #13                 // class java/util/HashMap
      13: dup
      14: invokespecial #16                 // Method java/util/HashMap."<init>":()V
      17: putstatic     #20                 // Field b:Ljava/util/Map;
      20: return

  static android.arch.lifecycle.GenericLifecycleObserver a(java.lang.Object);
    Code:
       0: aload_0
       1: instanceof    #24                 // class android/arch/lifecycle/FullLifecycleObserver
       4: ifeq          19
       7: new           #26                 // class android/arch/lifecycle/FullLifecycleObserverAdapter
      10: dup
      11: aload_0
      12: checkcast     #24                 // class android/arch/lifecycle/FullLifecycleObserver
      15: invokespecial #29                 // Method android/arch/lifecycle/FullLifecycleObserverAdapter."<init>":(Landroid/arch/lifecycle/FullLifecycleObserver;)V
      18: areturn
      19: aload_0
      20: instanceof    #31                 // class android/arch/lifecycle/GenericLifecycleObserver
      23: ifeq          31
      26: aload_0
      27: checkcast     #31                 // class android/arch/lifecycle/GenericLifecycleObserver
      30: areturn
      31: aload_0
      32: invokevirtual #35                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      35: astore_3
      36: aload_3
      37: invokestatic  #38                 // Method b:(Ljava/lang/Class;)I
      40: iconst_2
      41: if_icmpne     149
      44: getstatic     #20                 // Field b:Ljava/util/Map;
      47: aload_3
      48: invokeinterface #44,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      53: checkcast     #46                 // class java/util/List
      56: astore_3
      57: aload_3
      58: invokeinterface #50,  1           // InterfaceMethod java/util/List.size:()I
      63: istore_2
      64: iconst_0
      65: istore_1
      66: iload_2
      67: iconst_1
      68: if_icmpne     93
      71: new           #52                 // class android/arch/lifecycle/SingleGeneratedAdapterObserver
      74: dup
      75: aload_3
      76: iconst_0
      77: invokeinterface #55,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      82: checkcast     #57                 // class java/lang/reflect/Constructor
      85: aload_0
      86: invokestatic  #60                 // Method a:(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroid/arch/lifecycle/b;
      89: invokespecial #63                 // Method android/arch/lifecycle/SingleGeneratedAdapterObserver."<init>":(Landroid/arch/lifecycle/b;)V
      92: areturn
      93: aload_3
      94: invokeinterface #50,  1           // InterfaceMethod java/util/List.size:()I
      99: anewarray     #65                 // class android/arch/lifecycle/b
     102: astore        4
     104: iload_1
     105: aload_3
     106: invokeinterface #50,  1           // InterfaceMethod java/util/List.size:()I
     111: if_icmpge     139
     114: aload         4
     116: iload_1
     117: aload_3
     118: iload_1
     119: invokeinterface #55,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     124: checkcast     #57                 // class java/lang/reflect/Constructor
     127: aload_0
     128: invokestatic  #60                 // Method a:(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroid/arch/lifecycle/b;
     131: aastore
     132: iload_1
     133: iconst_1
     134: iadd
     135: istore_1
     136: goto          104
     139: new           #67                 // class android/arch/lifecycle/CompositeGeneratedAdaptersObserver
     142: dup
     143: aload         4
     145: invokespecial #70                 // Method android/arch/lifecycle/CompositeGeneratedAdaptersObserver."<init>":([Landroid/arch/lifecycle/b;)V
     148: areturn
     149: new           #72                 // class android/arch/lifecycle/ReflectiveGenericLifecycleObserver
     152: dup
     153: aload_0
     154: invokespecial #75                 // Method android/arch/lifecycle/ReflectiveGenericLifecycleObserver."<init>":(Ljava/lang/Object;)V
     157: areturn

  public static java.lang.String a(java.lang.String);
    Code:
       0: new           #95                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #96                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: ldc           #98                 // String .
      12: ldc           #100                // String _
      14: invokevirtual #106                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      17: invokevirtual #110                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      20: pop
      21: aload_1
      22: ldc           #112                // String _LifecycleAdapter
      24: invokevirtual #110                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      27: pop
      28: aload_1
      29: invokevirtual #116                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      32: areturn
}
