public class android.arch.lifecycle.CompositeGeneratedAdaptersObserver implements android.arch.lifecycle.GenericLifecycleObserver {
  android.arch.lifecycle.CompositeGeneratedAdaptersObserver(android.arch.lifecycle.b[]);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #15                 // Field a:[Landroid/arch/lifecycle/b;
       9: return

  public void a(android.arch.lifecycle.e, android.arch.lifecycle.c$a);
    Code:
       0: new           #19                 // class android/arch/lifecycle/i
       3: dup
       4: invokespecial #20                 // Method android/arch/lifecycle/i."<init>":()V
       7: astore        6
       9: aload_0
      10: getfield      #15                 // Field a:[Landroid/arch/lifecycle/b;
      13: astore        7
      15: aload         7
      17: arraylength
      18: istore        5
      20: iconst_0
      21: istore        4
      23: iconst_0
      24: istore_3
      25: iload_3
      26: iload         5
      28: if_icmpge     52
      31: aload         7
      33: iload_3
      34: aaload
      35: aload_1
      36: aload_2
      37: iconst_0
      38: aload         6
      40: invokeinterface #25,  5           // InterfaceMethod android/arch/lifecycle/b.a:(Landroid/arch/lifecycle/e;Landroid/arch/lifecycle/c$a;ZLandroid/arch/lifecycle/i;)V
      45: iload_3
      46: iconst_1
      47: iadd
      48: istore_3
      49: goto          25
      52: aload_0
      53: getfield      #15                 // Field a:[Landroid/arch/lifecycle/b;
      56: astore        7
      58: aload         7
      60: arraylength
      61: istore        5
      63: iload         4
      65: istore_3
      66: iload_3
      67: iload         5
      69: if_icmpge     93
      72: aload         7
      74: iload_3
      75: aaload
      76: aload_1
      77: aload_2
      78: iconst_1
      79: aload         6
      81: invokeinterface #25,  5           // InterfaceMethod android/arch/lifecycle/b.a:(Landroid/arch/lifecycle/e;Landroid/arch/lifecycle/c$a;ZLandroid/arch/lifecycle/i;)V
      86: iload_3
      87: iconst_1
      88: iadd
      89: istore_3
      90: goto          66
      93: return
}
