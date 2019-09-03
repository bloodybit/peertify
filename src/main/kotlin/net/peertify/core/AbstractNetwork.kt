import net.peertify.core.Peer
import net.peertify.core.PeerId

interface INetwork<PacketType> {
    fun init();
    fun getPackets()
    fun getPeers(): Array<Peer>
    fun sendPacket(packet: PacketType, recipient: PeerId);
    fun broadcastPacket(packet: PacketType)
}

