package net.peertify.core


typealias PeerId = ByteArrayKey

abstract class Peer(val id: PeerId, address: String) {

}
