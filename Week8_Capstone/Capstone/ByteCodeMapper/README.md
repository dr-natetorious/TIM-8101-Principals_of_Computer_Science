# Find the starting node

graph.traversal().V('org.smssecure.smssecure.service.QuickResponseService')

# Find the tail node

graph.traversal().V('org.smssecure.smssecure.sms.MessageSender').outE().inV().hasId('org.smssecure.smssecure.sms.MessageSender.send').outE().inV().hasId('org.smssecure.smssecure.sms.MessageSender.sendMediaMessage').