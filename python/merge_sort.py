#!/usr/bin/env bash


class UnionFind:
    # Initialize union-find data structure with
    # N objects (0 to N - 1)
    def __init__(self, N):
        self.N = N

    # Add connection between p and q
    def union(self, p, q):
        pass

    # are p and q in the same component?
    def connected(self, p, q):
        pass

    # component identifier for p(0 to N - 1)
    def find(self, p):
        pass

    # number of components
    def count(self):
        return self.N
