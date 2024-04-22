-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Des 2021 pada 19.48
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coyne`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `accountadmin`
--

CREATE TABLE `accountadmin` (
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `accountadmin`
--

INSERT INTO `accountadmin` (`username`, `password`) VALUES
('adminsatu', 'adminsatu'),
('', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `accountcustomer`
--

CREATE TABLE `accountcustomer` (
  `idCustomer` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `accountcustomer`
--

INSERT INTO `accountcustomer` (`idCustomer`, `username`, `password`, `email`) VALUES
(58, 'harjono', 'harjono', 'harjono@gmail.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `keranjang`
--

CREATE TABLE `keranjang` (
  `namaProduk` varchar(50) NOT NULL,
  `kategoriProduk` varchar(20) NOT NULL,
  `beratProduk` int(10) NOT NULL,
  `stokProduk` int(10) NOT NULL,
  `hargaProduk` int(20) NOT NULL,
  `gambarProduk` varchar(50) NOT NULL,
  `idProduk` int(20) NOT NULL,
  `usernameCustomer` varchar(50) NOT NULL,
  `qty` int(20) NOT NULL,
  `totalHarga` int(20) NOT NULL,
  `idKeranjang` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `idProduk` int(100) NOT NULL,
  `namaProduk` varchar(100) NOT NULL,
  `kategoriProduk` varchar(100) NOT NULL,
  `beratProduk` int(20) NOT NULL,
  `stokProduk` int(20) NOT NULL,
  `deskripsiProduk` varchar(100) NOT NULL,
  `hargaProduk` int(20) NOT NULL,
  `gambarProduk` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`idProduk`, `namaProduk`, `kategoriProduk`, `beratProduk`, `stokProduk`, `deskripsiProduk`, `hargaProduk`, `gambarProduk`) VALUES
(1, 'Mangga', 'Buah', 1, 6, 'Mangga segar menyehatkan', 10000, 'mangga.jpeg'),
(2, 'Alpukat', 'Buah', 1, 7, 'Alpukat manis', 8000, 'alpukat.jpeg'),
(3, 'Bayam', 'Sayur', 1, -4, 'Bayam seger', 7000, 'bayam.jpeg'),
(7, 'Terong', 'Sayur', 1, 3, 'Terong menyehatkan', 7000, 'terong.jpeg'),
(8, 'Wortel', 'Sayur', 1, -16, 'Wortel seger', 5000, 'wortel.jpeg'),
(9, 'Apel', 'Buah', 1, -69, 'Apel segar', 8000, 'apel.jpg');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `idPesanan` int(20) NOT NULL,
  `noHP` varchar(20) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `pilihPembayaran` varchar(20) NOT NULL,
  `totalHarga` int(20) NOT NULL,
  `tanggalPembelian` date NOT NULL,
  `namaProduk` varchar(50) NOT NULL,
  `qty` int(20) NOT NULL,
  `namaPembeli` varchar(100) NOT NULL,
  `buktiTransfer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `accountcustomer`
--
ALTER TABLE `accountcustomer`
  ADD PRIMARY KEY (`idCustomer`);

--
-- Indeks untuk tabel `keranjang`
--
ALTER TABLE `keranjang`
  ADD PRIMARY KEY (`idKeranjang`);

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`idProduk`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`idPesanan`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `accountcustomer`
--
ALTER TABLE `accountcustomer`
  MODIFY `idCustomer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT untuk tabel `keranjang`
--
ALTER TABLE `keranjang`
  MODIFY `idKeranjang` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT untuk tabel `produk`
--
ALTER TABLE `produk`
  MODIFY `idProduk` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `idPesanan` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=122;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
